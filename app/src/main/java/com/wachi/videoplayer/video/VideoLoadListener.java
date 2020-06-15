package com.wachi.videoplayer.video;

import java.util.ArrayList;

/**
 * Created by sudamasayuki on 2017/11/22.
 */

public interface VideoLoadListener {

    void onVideoLoaded(ArrayList<VideoItem> videoItems);

    void onFailed(Exception e);
}
