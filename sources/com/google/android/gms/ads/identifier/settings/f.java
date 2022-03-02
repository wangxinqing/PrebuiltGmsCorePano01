package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.security.MessageDigest;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class f {
    private static final String a = VersionInfoParcel.a().a;
    private static final String b = UUID.randomUUID().toString();

    private static void a(Context context, Bundle bundle) {
        bundle.putString("cl", "306753009");
        bundle.putString("r_cl", "HEAD");
        bundle.putString("session", b);
        b.a().a(context, a, "event-attestation", bundle);
    }

    static void a(Context context, String str, String str2) {
        if (awhh.h()) {
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("error_detail", str2);
            a(context, bundle);
        }
    }

    static void a(Context context, String str, String str2, long j) {
        if (awhh.h()) {
            Bundle bundle = new Bundle();
            bundle.putString("operation", str);
            bundle.putString("latency", Long.toString(j));
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("status", str2);
            }
            a(context, bundle);
        }
    }

    static void a(Context context, String str, Throwable th) {
        String str2;
        if (awhh.h()) {
            if (th != null) {
                str2 = Log.getStackTraceString(th);
            } else {
                str2 = "NULL_EXCEPTION";
            }
            Bundle bundle = new Bundle();
            bundle.putString("error_type", str);
            bundle.putString("exception", str2);
            a(context, bundle);
        }
    }

    static byte[] a(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(bArr);
        return instance.digest();
    }
}
