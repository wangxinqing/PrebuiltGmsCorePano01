package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: apov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apov {
    public static apvm a(Context context, PhoneAuthCredential phoneAuthCredential, String str) {
        if (phoneAuthCredential.c) {
            if (!a(context, phoneAuthCredential.d, str)) {
                return null;
            }
            String a = apox.a.a(context, phoneAuthCredential.d);
            String str2 = phoneAuthCredential.d;
            boolean z = phoneAuthCredential.e;
            apvm apvm = new apvm();
            apvm.a = true;
            iva.c(a);
            apvm.c = a;
            iva.c(str2);
            apvm.b = str2;
            apvm.h = z;
            return apvm;
        } else if (TextUtils.isEmpty(phoneAuthCredential.f)) {
            String str3 = phoneAuthCredential.a;
            String str4 = phoneAuthCredential.b;
            boolean z2 = phoneAuthCredential.e;
            apvm apvm2 = new apvm();
            apvm2.a = false;
            iva.c(str3);
            apvm2.d = str3;
            iva.c(str4);
            apvm2.e = str4;
            apvm2.h = z2;
            return apvm2;
        } else {
            String str5 = phoneAuthCredential.d;
            String str6 = phoneAuthCredential.f;
            boolean z3 = phoneAuthCredential.e;
            apvm apvm3 = new apvm();
            apvm3.a = false;
            iva.c(str5);
            apvm3.b = str5;
            iva.c(str6);
            apvm3.f = str6;
            apvm3.h = z3;
            return apvm3;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        if (apox.a.a(context, str, false)) {
            return true;
        }
        Log.e(str2, "Phone Number instant validation failed - phone number has no verificationProof.");
        return false;
    }
}
