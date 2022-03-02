package androidx.slice.compat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SlicePermissionActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
    private Uri a;
    private String b;
    private String c;
    private ss d;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r6 = r6.substring(0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.CharSequence a(android.content.pm.PackageManager r6, android.content.pm.ApplicationInfo r7) {
        /*
            java.lang.CharSequence r6 = r7.loadLabel(r6)
            java.lang.String r6 = r6.toString()
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            java.lang.String r6 = r6.toString()
            int r0 = r6.length()
            r1 = 0
            r2 = 0
        L_0x0016:
            if (r2 >= r0) goto L_0x005d
            int r3 = r6.codePointAt(r2)
            int r4 = java.lang.Character.getType(r3)
            r5 = 13
            if (r4 != r5) goto L_0x0025
            goto L_0x0058
        L_0x0025:
            r5 = 15
            if (r4 == r5) goto L_0x0058
            r5 = 14
            if (r4 == r5) goto L_0x0058
            r5 = 12
            if (r4 != r5) goto L_0x0052
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r6.substring(r1, r2)
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            int r5 = java.lang.Character.charCount(r3)
            int r5 = r5 + r2
            java.lang.String r6 = r6.substring(r5)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
        L_0x0052:
            int r3 = java.lang.Character.charCount(r3)
            int r2 = r2 + r3
            goto L_0x0016
        L_0x0058:
            java.lang.String r6 = r6.substring(r1, r2)
        L_0x005d:
            java.lang.String r6 = r6.trim()
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x006a
            java.lang.String r6 = r7.packageName
            return r6
        L_0x006a:
            android.text.TextPaint r7 = new android.text.TextPaint
            r7.<init>()
            r0 = 1109917696(0x42280000, float:42.0)
            r7.setTextSize(r0)
            r0 = 1140457472(0x43fa0000, float:500.0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r6 = android.text.TextUtils.ellipsize(r6, r7, r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.compat.SlicePermissionActivity.a(android.content.pm.PackageManager, android.content.pm.ApplicationInfo):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r5, int r6) {
        /*
            r4 = this;
            r5 = -1
            if (r6 != r5) goto L_0x0056
            java.lang.String r5 = r4.getPackageName()
            java.lang.String r6 = r4.b
            android.net.Uri r0 = r4.a
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = ""
            android.net.Uri$Builder r0 = r0.path(r1)
            android.net.Uri r0 = r0.build()
            android.content.ContentResolver r1 = r4.getContentResolver()
            apa r1 = defpackage.apb.a((android.content.ContentResolver) r1, (android.net.Uri) r0)     // Catch:{ RemoteException -> 0x004e }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "slice_uri"
            r2.putParcelable(r3, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "provider_pkg"
            r2.putString(r0, r5)     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "pkg"
            r2.putString(r5, r6)     // Catch:{ all -> 0x0042 }
            android.content.ContentProviderClient r5 = r1.a     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "grant_perms"
            java.lang.String r0 = "supports_versioned_parcelable"
            r5.call(r6, r0, r2)     // Catch:{ all -> 0x0042 }
            r1.close()     // Catch:{ RemoteException -> 0x004e }
            goto L_0x0056
        L_0x0042:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r6 = move-exception
            r1.close()     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r0)     // Catch:{ RemoteException -> 0x004e }
        L_0x004d:
            throw r6     // Catch:{ RemoteException -> 0x004e }
        L_0x004e:
            r5 = move-exception
            java.lang.String r6 = "SliceProviderCompat"
            java.lang.String r0 = "Unable to get slice descendants"
            android.util.Log.e(r6, r0, r5)
        L_0x0056:
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.compat.SlicePermissionActivity.onClick(android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (Uri) getIntent().getParcelableExtra("slice_uri");
        this.b = getIntent().getStringExtra("pkg");
        this.c = getIntent().getStringExtra("provider_pkg");
        try {
            PackageManager packageManager = getPackageManager();
            String a2 = nn.a().a(a(packageManager, packageManager.getApplicationInfo(this.b, 0)).toString());
            String a3 = nn.a().a(a(packageManager, packageManager.getApplicationInfo(this.c, 0)).toString());
            sr srVar = new sr(this);
            srVar.b((CharSequence) getString(R.string.abc_slice_permission_title, new Object[]{a2, a3}));
            sn snVar = srVar.a;
            snVar.t = null;
            snVar.s = R.layout.abc_slice_permission_request;
            snVar.u = false;
            srVar.a((int) R.string.abc_slice_permission_deny, (DialogInterface.OnClickListener) this);
            srVar.b((int) R.string.abc_slice_permission_allow, (DialogInterface.OnClickListener) this);
            srVar.a((DialogInterface.OnDismissListener) this);
            ss c2 = srVar.c();
            this.d = c2;
            ((TextView) c2.getWindow().getDecorView().findViewById(R.id.text1)).setText(getString(R.string.abc_slice_permission_text_1, new Object[]{a3}));
            ((TextView) this.d.getWindow().getDecorView().findViewById(R.id.text2)).setText(getString(R.string.abc_slice_permission_text_2, new Object[]{a3}));
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("SlicePermissionActivity", "Couldn't find package", e);
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        ss ssVar = this.d;
        if (ssVar != null && ssVar.isShowing()) {
            this.d.cancel();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        finish();
    }
}
