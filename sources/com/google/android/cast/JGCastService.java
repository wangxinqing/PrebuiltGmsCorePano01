package com.google.android.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class JGCastService {
    public static final boolean DEBUG = false;
    public static final int FLAG_PRIVATE_DISPLAY = 1073741824;
    public static final int FLAG_SHOW_RECEIVER_STATS = 2;
    public static final int FLAG_SHOW_SENDER_STATS = 1;
    public static final int FLAG_USE_TDLS = Integer.MIN_VALUE;
    private static final String TAG = "JGCastService";
    public boolean mDidLoadLibrary;
    private Handler mEventHandler;
    public biy mListener;
    private long mNativeContext;

    public JGCastService(Context context, biy biy) {
        this.mListener = biy;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        if (myLooper != null) {
            this.mEventHandler = new bix(this, myLooper);
        }
        boolean a = a(context, "jgcastservice");
        this.mDidLoadLibrary = a;
        if (!a) {
            Log.e(TAG, "Unable to load JGCastService library");
            return;
        }
        native_init();
        native_setup(new WeakReference(this), context, (Intent) null);
    }

    private final native void native_finalize();

    private static final native void native_init();

    private final native void native_setLogger(JGCastLogger jGCastLogger);

    private final native void native_setup(Object obj, Context context, Intent intent);

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Surface surface) {
        JGCastService jGCastService = (JGCastService) ((WeakReference) obj).get();
        if (jGCastService != null) {
            jGCastService.mEventHandler.sendMessage(jGCastService.mEventHandler.obtainMessage(i, i2, i3, surface));
        }
    }

    public boolean a(Context context, String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e) {
            String obj = context.getClassLoader().toString();
            Log.e(TAG, "Unable to locate " + str + " in " + obj, e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.mDidLoadLibrary) {
            native_finalize();
        }
        super.finalize();
    }

    public final native void native_createSourceOrSink(boolean z, String str, String str2, String str3, Surface surface, int i);

    public final native void native_disconnect();

    public final native void native_release();

    public final native void native_setParameters(boolean z, String str);
}
