package defpackage;

/* renamed from: aoec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aoec implements auco {
    UNKNOWN_ORIGIN(0),
    ANDROID_AUTOCOMPLETE_FRAGMENT(1),
    ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER(2),
    ANDROID_PLACE_PICKER(3),
    ANDROID_ADAPTER(4),
    IOS_AUTOCOMPLETE_VIEW_CONTROLLER(5),
    IOS_AUTOCOMPLETE_SEARCH_CONTROLLER(6),
    IOS_AUTOCOMPLETE_DATA_SOURCE(7),
    IOS_PLACE_PICKER(8);
    
    public final int j;

    private aoec(int i) {
        this.j = i;
    }

    public static aoec a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ORIGIN;
            case 1:
                return ANDROID_AUTOCOMPLETE_FRAGMENT;
            case 2:
                return ANDROID_AUTOCOMPLETE_MANUAL_LAUNCHER;
            case 3:
                return ANDROID_PLACE_PICKER;
            case 4:
                return ANDROID_ADAPTER;
            case 5:
                return IOS_AUTOCOMPLETE_VIEW_CONTROLLER;
            case 6:
                return IOS_AUTOCOMPLETE_SEARCH_CONTROLLER;
            case 7:
                return IOS_AUTOCOMPLETE_DATA_SOURCE;
            case 8:
                return IOS_PLACE_PICKER;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aoeb.a;
    }

    public final int a() {
        return this.j;
    }

    public final String toString() {
        return Integer.toString(this.j);
    }
}
