package com.db.nimbuzzrockerheiuiemojibydb;

import android.support.annotation.DrawableRes;

import com.db.nimbuzzrockerheiuiemojibydb.emoji.Emojicon;

/**
 * Created by DB on 03-12-2017.
 */

public class EmojiconPage {
    @Emojicon.Type
    private int type;
    private Emojicon[] data;
    private boolean useSystemDefaults;
    private
    @DrawableRes
    int icon;

    public EmojiconPage(@Emojicon.Type int type, Emojicon[] data, boolean useSystemDefaults, int icon) {
        this.type = type;
        this.data = data;
        this.useSystemDefaults = useSystemDefaults;
        this.icon = icon;
    }

    @Emojicon.Type
    public int getType() {
        return type;
    }

    public boolean isUseSystemDefaults() {
        return useSystemDefaults;
    }

    public Emojicon[] getData() {
        return data;
    }

    public int getIcon() {
        return icon;
    }
}
