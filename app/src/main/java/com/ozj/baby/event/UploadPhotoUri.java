package com.ozj.baby.event;

import android.net.Uri;

/**
 * Created by YX201603-6 on 2016/4/27.
 */
public class UploadPhotoUri {
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public UploadPhotoUri(int type, Uri uri) {
        this.type = type;
        this.uri = uri;
    }

    private int type;

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    private Uri uri;
}
