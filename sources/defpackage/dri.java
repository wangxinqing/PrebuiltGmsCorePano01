package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: dri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dri {
    public final Context a;
    public final GoogleSettingsItem b;
    public String c;
    public String d;
    public String e;
    boolean f = true;

    public dri(Context context, GoogleSettingsItem googleSettingsItem) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) googleSettingsItem);
        this.b = googleSettingsItem;
        Intent intent = googleSettingsItem.b;
        if (intent == null) {
            Log.w("IndexableItem", "intent is null");
            this.f = false;
            return;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            Log.w("IndexableItem", "pm is null");
            this.f = false;
            return;
        }
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(packageManager, 0);
        if (resolveActivityInfo == null) {
            Log.w("IndexableItem", "info is null");
            this.f = false;
        } else if (!resolveActivityInfo.exported) {
            String valueOf = String.valueOf(intent);
            String str = this.b.d;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(str).length());
            sb.append("target is not exported: ");
            sb.append(valueOf);
            sb.append(", title:");
            sb.append(str);
            Log.e("IndexableItem", sb.toString());
            this.f = false;
        } else {
            this.d = resolveActivityInfo.packageName;
            String action = intent.getAction();
            if (action != null) {
                this.c = action;
            }
            if (this.c == null) {
                this.c = "android.intent.action.MAIN";
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                this.e = component.getClassName();
            }
            if (this.d == null) {
                this.f = false;
                String valueOf2 = String.valueOf(this.b.b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("targetPackageName is null:");
                sb2.append(valueOf2);
                Log.e("IndexableItem", sb2.toString());
            }
        }
    }

    public final String a() {
        return this.b.d;
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.b.n)) {
            return this.b.n;
        }
        String valueOf = String.valueOf(this.b.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("indexing key is not set:");
        sb.append(valueOf);
        Log.w("IndexableItem", sb.toString());
        return a();
    }
}
