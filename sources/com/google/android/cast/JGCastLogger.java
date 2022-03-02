package com.google.android.cast;

import android.content.Context;
import java.io.FileDescriptor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JGCastLogger {
    private static final String TAG = "JGCastLogger";
    private boolean mDidLoadLibrary;
    private long mNativeContext;

    private final native boolean native_collectData(FileDescriptor fileDescriptor);

    private final native void native_finalize();

    private static final native void native_init();

    private final native void native_release();

    private final native void native_setup(Object obj, Context context, String str);

    /* access modifiers changed from: protected */
    public final void finalize() {
        throw null;
    }
}
