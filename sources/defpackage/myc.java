package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: myc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class myc {
    public static void a(Context context, ErrorReport errorReport, int i, Account account, String str, String str2, int i2) {
        olo b = b(context, errorReport, account);
        aucd aucd = (aucd) b.c(5);
        aucd.a((aucj) b);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo = (olo) aucd.b;
        olo olo2 = olo.I;
        olo.j = i - 1;
        olo.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (!TextUtils.isEmpty(str)) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo3 = (olo) aucd.b;
            str.getClass();
            olo3.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            olo3.n = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo4 = (olo) aucd.b;
            str2.getClass();
            olo4.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            olo4.m = str2;
        }
        if (i2 > 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            olo olo5 = (olo) aucd.b;
            olo5.a |= 16384;
            olo5.o = i2;
        }
        myn.a(context, (olo) aucd.i());
    }

    static olo b(Context context, ErrorReport errorReport, Account account) {
        int length;
        int length2;
        byte[] bArr;
        aucd o = olo.I.o();
        ApplicationErrorReport applicationErrorReport = errorReport.a;
        if (applicationErrorReport != null && applicationErrorReport.packageName != null) {
            String str = errorReport.a.packageName;
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo = (olo) o.b;
            str.getClass();
            olo.a |= 2;
            olo.d = str;
        } else if (!TextUtils.isEmpty(errorReport.R)) {
            String str2 = errorReport.R;
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo2 = (olo) o.b;
            str2.getClass();
            olo2.a |= 2;
            olo2.d = str2;
        }
        String str3 = null;
        if (!TextUtils.isEmpty(((olo) o.b).d)) {
            try {
                str3 = context.getPackageManager().getPackageInfo(((olo) o.b).d, 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo3 = (olo) o.b;
            str3.getClass();
            olo3.b |= 2;
            olo3.B = str3;
        }
        if (account != null) {
            String a = myo.a(account);
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo4 = (olo) o.b;
            a.getClass();
            olo4.a |= 4;
            olo4.e = a;
        }
        if (!TextUtils.isEmpty(errorReport.ag)) {
            String str4 = errorReport.ag;
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo5 = (olo) o.b;
            str4.getClass();
            olo5.a |= 64;
            olo5.i = str4;
        }
        String d = axgy.d();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olo olo6 = (olo) o.b;
        d.getClass();
        olo6.a |= 16;
        olo6.g = d;
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
        if (errorReport.af != null || errorReport.S != null || !TextUtils.isEmpty(errorReport.u) || (((bArr = errorReport.v) != null && bArr.length > 0) || !TextUtils.isEmpty(errorReport.T))) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo9 = (olo) o.b;
            olo9.b |= 16;
            olo9.E = true;
        }
        Bundle bundle = errorReport.D;
        if (bundle != null && bundle.size() > 0) {
            int size = errorReport.D.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo10 = (olo) o.b;
            olo10.b |= 4;
            olo10.C = size;
        }
        FileTeleporter[] fileTeleporterArr = errorReport.U;
        if (fileTeleporterArr == null || (length2 = fileTeleporterArr.length) <= 0) {
            String[] strArr = errorReport.V;
            if (strArr != null && (length = strArr.length) > 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                olo olo11 = (olo) o.b;
                olo11.b |= 8;
                olo11.D = length;
            }
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            olo olo12 = (olo) o.b;
            olo12.b |= 8;
            olo12.D = length2;
        }
        return (olo) o.i();
    }

    public static void a(Context context, ErrorReport errorReport, Account account) {
        ThemeSettings themeSettings = errorReport.Y;
        int i = 193;
        if (themeSettings != null) {
            int i2 = themeSettings.a;
            if (!(i2 == 0 || i2 == 1)) {
                i = i2 != 2 ? 194 : 192;
            }
        } else {
            i = 194;
        }
        olo b = b(context, errorReport, account);
        aucd aucd = (aucd) b.c(5);
        aucd.a((aucj) b);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        olo olo = (olo) aucd.b;
        olo olo2 = olo.I;
        olo.j = 182;
        int i3 = olo.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        olo.a = i3;
        olo.k = i - 1;
        olo.a = i3 | 1024;
        myn.a(context, (olo) aucd.i());
    }
}
