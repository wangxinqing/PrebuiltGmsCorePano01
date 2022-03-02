package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.telecom.TelecomManager;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aayi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aayi {
    private static final String b = new BigInteger(130, new SecureRandom()).toString(16);
    public final Context a;
    private final PackageManager c;

    static {
        aayi.class.getSimpleName();
    }

    public aayi(Context context) {
        this.a = context;
        this.c = context.getPackageManager();
    }

    private final PackageInfo a(Intent intent) {
        ResolveInfo resolveActivity = this.c.resolveActivity(intent, 65536);
        if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
            try {
                return this.c.getPackageInfo(resolveActivity.activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final PackageInfo b() {
        String str = b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("file://");
        sb.append(str);
        sb.append(".apk");
        Uri parse = Uri.parse(sb.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, "application/vnd.android.package-archive");
        return a(intent);
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        TelecomManager telecomManager;
        if (Build.VERSION.SDK_INT < 23 || (telecomManager = (TelecomManager) this.a.getSystemService("telecom")) == null) {
            return null;
        }
        return telecomManager.getDefaultDialerPackage();
    }

    /* access modifiers changed from: package-private */
    public final List d() {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.PACKAGE_NEEDS_VERIFICATION");
        intent.setType("application/vnd.android.package-archive");
        List<ResolveInfo> queryBroadcastReceivers = this.c.queryBroadcastReceivers(intent, 512);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo next : queryBroadcastReceivers) {
                if (next.activityInfo != null) {
                    String str = next.activityInfo.packageName;
                    if (this.c.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str) == 0) {
                        try {
                            arrayList.add(this.c.getPackageInfo(str, 0));
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final PackageInfo a() {
        String str = b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("http://");
        sb.append(str);
        sb.append(".com");
        return a(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }
}
