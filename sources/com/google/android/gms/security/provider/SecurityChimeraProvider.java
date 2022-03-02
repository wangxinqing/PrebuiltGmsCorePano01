package com.google.android.gms.security.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SecurityChimeraProvider extends ContentProvider {
    private Context a;
    private aaal b;

    public static String a() {
        if (jkr.b()) {
            return Build.VERSION.SECURITY_PATCH;
        }
        return null;
    }

    private final aanv d() {
        return new aany(this.a).a(false, 10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        int i = 1;
        if (!this.b.a(this.a) && !this.b.d()) {
            i = -1;
        }
        Settings.Secure.putInt(this.a.getContentResolver(), "package_verifier_state", i);
        return i;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Uri parse;
        List<String> pathSegments;
        String str3;
        String str4;
        List<ResolveInfo> queryIntentActivities;
        Date a2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (parse = Uri.parse(str2)) != null && "content".equals(parse.getScheme()) && "com.google.android.gms.security.provider".equals(parse.getAuthority()) && parse.getPort() == -1 && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2) {
            int i = 0;
            if (str.equals(pathSegments.get(0))) {
                String str5 = pathSegments.get(1);
                if (!"getText".equals(str)) {
                    if ("getIcon".equals(str) && (queryIntentActivities = this.a.getPackageManager().queryIntentActivities(new Intent("android.settings.SETTINGS"), 1114112)) != null && !queryIntentActivities.isEmpty()) {
                        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                        String str6 = activityInfo != null ? activityInfo.packageName : null;
                        if (!TextUtils.isEmpty(str6)) {
                            if ("PackageVerifierIcon".equals(str5)) {
                                aanv d = d();
                                if (d != null) {
                                    i = d.b;
                                }
                                i = (b() == 1 && i == 0) ? a(str6, "ic_package_verifier_enabled") : a(str6, "ic_package_verifier_disabled");
                            } else if ("FindDeviceIcon".equals(str5)) {
                                i = c() == 1 ? a(str6, "ic_find_device_enabled") : a(str6, "ic_find_device_disabled");
                            } else if ("SecurityPatchLevelIcon".equals(str5)) {
                                String a3 = a();
                                if (!TextUtils.isEmpty(a3) && (a2 = a(a3)) != null) {
                                    long time = new Date().getTime() - a2.getTime();
                                    i = time <= 0 ? a(str6, "ic_ota_update_current") : TimeUnit.DAYS.convert(time, TimeUnit.MILLISECONDS) > 90 ? a(str6, "ic_ota_update_none") : a(str6, "ic_ota_update_current");
                                }
                            }
                            if (i != 0) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("com.android.settings.icon", i);
                                bundle2.putString("com.android.settings.icon_package", str6);
                                return bundle2;
                            }
                        }
                    }
                    return null;
                }
                Bundle bundle3 = new Bundle();
                if ("PackageVerifierSummary".equals(str5)) {
                    if (b() != 1) {
                        str3 = this.a.getString(R.string.security_status_verify_apps_disabled);
                    } else {
                        aanv d2 = d();
                        str3 = d2 != null ? d2.a(this.a) : null;
                    }
                    bundle3.putString("com.android.settings.summary", str3);
                } else if ("FindDeviceSummary".equals(str5)) {
                    int c = c();
                    if (c == -4) {
                        str4 = this.a.getString(R.string.security_status_no_google_account_summary);
                    } else if (c == -2 || c == -3) {
                        str4 = this.a.getString(R.string.security_status_find_device_location_off_summary);
                    } else if (c == -1) {
                        str4 = this.a.getString(R.string.common_off);
                    } else {
                        str4 = c == 1 ? this.a.getString(R.string.common_on) : null;
                    }
                    bundle3.putString("com.android.settings.summary", str4);
                } else if ("SecurityPatchLevelSummary".equals(str5)) {
                    String a4 = a();
                    if (!TextUtils.isEmpty(a4)) {
                        Date a5 = a(a4);
                        if (a5 != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            a4 = DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMMMMyyyy"), a5).toString();
                        }
                    } else {
                        a4 = null;
                    }
                    bundle3.putString("com.android.settings.summary", a4);
                }
                if (!bundle3.isEmpty()) {
                    return bundle3;
                }
                return null;
            }
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        this.a = getContext();
        this.b = new aaal(this.a);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (jgu.d(context, context.getPackageName()).isEmpty()) {
            return -4;
        }
        if (!((Boolean) smo.e.a()).booleanValue()) {
            return -1;
        }
        if (jjm.a(this.a)) {
            return snm.a(this.a) ? 1 : -2;
        }
        return -3;
    }

    public static Date a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str);
        } catch (ParseException e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(String str, String str2) {
        try {
            return this.a.getPackageManager().getResourcesForApplication(str).getIdentifier(str2, "drawable", str);
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }
}
