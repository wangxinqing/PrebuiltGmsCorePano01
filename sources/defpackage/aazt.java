package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.security.verifier.ApkUploadEntry;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;
import java.util.Set;

/* renamed from: aazt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazt extends AsyncTask {
    final /* synthetic */ Intent a;
    final /* synthetic */ int b;
    final /* synthetic */ InternalApkUploadChimeraService c;

    public aazt(InternalApkUploadChimeraService internalApkUploadChimeraService, Intent intent, int i) {
        this.c = internalApkUploadChimeraService;
        this.a = intent;
        this.b = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        byte[] bArr;
        int i;
        int i2;
        Void[] voidArr = (Void[]) objArr;
        InternalApkUploadChimeraService internalApkUploadChimeraService = this.c;
        Intent intent = this.a;
        int i3 = this.b;
        int i4 = InternalApkUploadChimeraService.a;
        String stringExtra = intent.getStringExtra("package_name");
        if (TextUtils.isEmpty(stringExtra)) {
            abaa.a("No package name specified", new Object[0]);
        } else if (!intent.hasExtra("version_code")) {
            abaa.a("No version code specified", new Object[0]);
        } else {
            int intExtra = intent.getIntExtra("version_code", -1);
            Object obj = intent.getExtras().get("digest");
            if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else if (obj instanceof String) {
                try {
                    bArr = jhg.a((String) obj);
                } catch (IllegalArgumentException e) {
                    abaa.a(e, "Provided digest is invalid", new Object[0]);
                }
            } else {
                bArr = null;
            }
            if (bArr == null || bArr.length != 32) {
                abaa.a("Incorrect digest length", new Object[0]);
            } else if (!intent.hasExtra("length")) {
                abaa.a("No length provided", new Object[0]);
            } else if (intent.getIntExtra("length", -1) >= 52428800) {
                abaa.a("Not uploading: apk is too large", new Object[0]);
            } else {
                byte[] byteArrayExtra = intent.getByteArrayExtra("token");
                if (azfv.u()) {
                    i = aazs.a(intent.getIntExtra("upload_reason", 0));
                } else {
                    i = 0;
                }
                if (i != 0) {
                    i2 = i;
                } else {
                    i2 = 1;
                }
                internalApkUploadChimeraService.a(true);
                abaa.b("Adding apk for upload: %s:%d", stringExtra, Integer.valueOf(intExtra));
                internalApkUploadChimeraService.f.b(new ApkUploadEntry(stringExtra, intExtra, bArr, byteArrayExtra, System.currentTimeMillis(), i2));
                aarq aarq = new aarq(internalApkUploadChimeraService);
                Set d = aarq.d();
                if (d.size() > 1000000) {
                    d.clear();
                }
                d.add(aaae.a(bArr));
                SharedPreferences.Editor edit = aarq.a.edit();
                edit.putStringSet("snet_upload_requested_apks", d);
                edit.commit();
                internalApkUploadChimeraService.h.sendMessageDelayed(internalApkUploadChimeraService.h.obtainMessage(0, i3, 0), (long) InternalApkUploadChimeraService.a);
                return null;
            }
        }
        this.c.a(this.b);
        return null;
    }
}
