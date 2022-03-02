package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: mye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mye extends isy {
    public final Context a;

    public final Feature[] D() {
        return muw.c;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof mym) {
            return (mym) queryLocalInterface;
        }
        return new myk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public final int d() {
        return 11925000;
    }

    public mye(Context context, Looper looper, ica ica, icb icb, ise ise) {
        super(context, looper, 29, ise, ica, icb);
        this.a = context;
        aeej.a(context);
    }

    public final void a(FeedbackOptions feedbackOptions) {
        String str;
        aucd o = olo.I.o();
        if (TextUtils.isEmpty(feedbackOptions.g)) {
            String packageName = this.a.getApplicationContext().getPackageName();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo = (olo) o.b;
            packageName.getClass();
            olo.a |= 2;
            olo.d = packageName;
        } else {
            String str2 = feedbackOptions.g;
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str2.getClass();
            olo2.a |= 2;
            olo2.d = str2;
        }
        try {
            str = this.a.getPackageManager().getPackageInfo(((olo) o.b).d, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str = null;
        }
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo3 = (olo) o.b;
            str.getClass();
            olo3.b |= 2;
            olo3.B = str;
        }
        String str3 = feedbackOptions.a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String a2 = myo.a(new Account(str3, "com.google"));
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo4 = (olo) o.b;
            a2.getClass();
            olo4.a |= 4;
            olo4.e = a2;
        }
        String str4 = feedbackOptions.n;
        if (str4 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo5 = (olo) o.b;
            str4.getClass();
            olo5.a |= 64;
            olo5.i = str4;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo6 = (olo) o.b;
        "feedback.android".getClass();
        olo6.a |= 16;
        olo6.g = "feedback.android";
        int i = hxj.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo7 = (olo) o.b;
        olo7.a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        olo7.y = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo8 = (olo) o.b;
        olo8.a |= 16777216;
        olo8.t = currentTimeMillis;
        if (!(feedbackOptions.m == null && feedbackOptions.f == null)) {
            olo8.b |= 16;
            olo8.E = true;
        }
        Bundle bundle = feedbackOptions.b;
        if (bundle != null) {
            int size = bundle.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo9 = (olo) o.b;
            olo9.b |= 4;
            olo9.C = size;
        }
        List list = feedbackOptions.h;
        if (list != null && list.size() > 0) {
            int size2 = feedbackOptions.h.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo10 = (olo) o.b;
            olo10.b |= 8;
            olo10.D = size2;
        }
        olo olo11 = (olo) o.i();
        aucd aucd = (aucd) olo11.c(5);
        aucd.a((aucj) olo11);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo12 = (olo) aucd.b;
        olo12.j = 164;
        olo12.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        myn.a(this.a, (olo) aucd.i());
    }
}
