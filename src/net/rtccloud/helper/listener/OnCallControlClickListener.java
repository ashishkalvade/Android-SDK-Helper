package net.rtccloud.helper.listener;

import net.rtccloud.helper.view.CallControls.WeemoCallButton;

/**
 * Interface definition for a callback to be invoked when a {@link WeemoCallButton} is clicked.
 * 
 * @author Simon Marquis <simon.marquis@sightcall.com>
 */
public interface OnCallControlClickListener {
	/**
     * Called when a {@link WeemoCallButton} has been clicked.
     *
	 * @param button The button that was clicked.
	 */
	public void onWeemoCallControlsClick(WeemoCallButton button);
}