package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: ifr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ifr {
    public static final Object a = new Object();
    public static ifr b;
    public final String c;
    public final Status d;
    private final boolean e;

    public ifr(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.e = resources.getInteger(identifier) == 0 ? true : z;
        } else {
            this.e = false;
        }
        synchronized (iuq.a) {
            if (!iuq.b) {
                iuq.b = true;
                try {
                    Bundle bundle = jni.b(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        iuq.c = bundle.getString("com.google.app.id");
                        bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
        String str = iuq.c;
        str = str == null ? new ivr(context).a("google_app_id") : str;
        if (TextUtils.isEmpty(str)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.c = null;
            return;
        }
        this.c = str;
        this.d = Status.a;
    }

    private static ifr a(String str) {
        ifr ifr;
        synchronized (a) {
            if (b != null) {
                ifr = b;
            } else {
                StringBuilder sb = new StringBuilder(str.length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return ifr;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").e;
    }

    public static String a() {
        return a("getGoogleAppId").c;
    }

    public ifr(String str) {
        this.c = str;
        this.d = Status.a;
        this.e = false;
    }
}
