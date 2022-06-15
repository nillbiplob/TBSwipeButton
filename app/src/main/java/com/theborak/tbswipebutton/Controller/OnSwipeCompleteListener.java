package com.theborak.tbswipebutton.Controller;

import com.theborak.tbswipebutton.View.TBSwipeButton;

/**
 * Created by Gratus on 02/10/18.
 */

public interface OnSwipeCompleteListener {
    void onSwipe_Forward(TBSwipeButton swipe_button_view);
    void onSwipe_Reverse(TBSwipeButton swipe_button_view);
}
