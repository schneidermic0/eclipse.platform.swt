/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.custom;

import java.util.*;

/**
 * Classes which implement this interface provide methods
 * that deal with the events that are generated by the CTabFolder
 * control.
 * <p>
 * After creating an instance of a class that implements
 * this interface it can be added to a CTabFolder using the
 * <code>addCTabFolder2Listener</code> method and removed using
 * the <code>removeCTabFolder2Listener</code> method. When
 * events occurs in a CTabFolder the appropriate method
 * will be invoked.
 * </p>
 *
 * @see CTabFolder2Adapter
 * @see CTabFolderEvent
 *
 * @since 3.0
 */
public interface CTabFolder2Listener extends EventListener {

/**
 * Sent when the user clicks on the close button of an item in the CTabFolder.
 * The item being closed is specified in the event.item field.
 * Setting the event.doit field to false will stop the CTabItem from closing.
 * When the CTabItem is closed, it is disposed.  The contents of the
 * CTabItem (see CTabItem.setControl) will be made not visible when
 * the CTabItem is closed.
 *
 * @param event an event indicating the item being closed
 */
public void close(CTabFolderEvent event);

/**
 * Sent when the user clicks on the minimize button of a CTabFolder.
 * The state of the CTabFolder does not change automatically - it
 * is up to the application to change the state of the CTabFolder
 * in response to this event using CTabFolder.setMinimized(true).
 *
 * @param event an event containing information about the minimize
 *
 * @see CTabFolder#getMinimized()
 * @see CTabFolder#setMinimized(boolean)
 * @see CTabFolder#setMinimizeVisible(boolean)
 */
public void minimize(CTabFolderEvent event);

/**
 * Sent when the user clicks on the maximize button of a CTabFolder.
 * The state of the CTabFolder does not change automatically - it
 * is up to the application to change the state of the CTabFolder
 * in response to this event using CTabFolder.setMaximized(true).
 *
 * @param event an event containing information about the maximize
 *
 * @see CTabFolder#getMaximized()
 * @see CTabFolder#setMaximized(boolean)
 * @see CTabFolder#setMaximizeVisible(boolean)
 */
public void maximize(CTabFolderEvent event);

/**
 * Sent when the user clicks on the restore button of a CTabFolder.
 * This event is sent either to restore the CTabFolder from the
 * minimized state or from the maximized state.  To determine
 * which restore is requested, use CTabFolder.getMinimized() or
 * CTabFolder.getMaximized() to determine the current state.
 * The state of the CTabFolder does not change automatically - it
 * is up to the application to change the state of the CTabFolder
 * in response to this event using CTabFolder.setMaximized(false)
 * or CTabFolder.setMinimized(false).
 *
 * @param event an event containing information about the restore
 *
 * @see CTabFolder#getMinimized()
 * @see CTabFolder#getMaximized()
 * @see CTabFolder#setMinimized(boolean)
 * @see CTabFolder#setMinimizeVisible(boolean)
 * @see CTabFolder#setMaximized(boolean)
 * @see CTabFolder#setMaximizeVisible(boolean)
 */
public void restore(CTabFolderEvent event);

/**
 * Sent when the user clicks on the chevron button of the CTabFolder.
 * A chevron appears in the CTabFolder when there are more tabs
 * than can be displayed at the current widget size.  To select a
 * tab that is not currently visible, the user clicks on the
 * chevron and selects a tab item from a list.  By default, the
 * CTabFolder provides a list of all the items that are not currently
 * visible, however, the application can provide its own list by setting
 * the event.doit field to <code>false</code> and displaying a selection list.
 *
 * @param event an event containing information about the show list
 *
 * @see CTabFolder#setSelection(CTabItem)
 */
public void showList(CTabFolderEvent event);
}
