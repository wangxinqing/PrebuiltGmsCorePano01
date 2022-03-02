package defpackage;

import android.location.Location;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import com.android.volley.Response;

/* renamed from: snj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snj extends snd {
    final /* synthetic */ sng a;

    public snj(sng sng) {
        this.a = sng;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean a() {
        /*
            r9 = this;
            sng r0 = r9.a
            android.media.RingtoneManager r1 = new android.media.RingtoneManager
            android.content.Context r2 = r0.k
            r1.<init>(r2)
            java.lang.String r2 = "Orion"
            android.database.Cursor r3 = r1.getCursor()     // Catch:{ all -> 0x0063 }
            r4 = 0
            r5 = 0
        L_0x0011:
            int r6 = r3.getCount()     // Catch:{ all -> 0x0061 }
            r7 = 1
            if (r5 >= r6) goto L_0x003c
            r3.moveToPosition(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r3.getString(r7)     // Catch:{ all -> 0x0061 }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x0039
            android.net.Uri r6 = r1.getRingtoneUri(r5)     // Catch:{ all -> 0x0061 }
            boolean r6 = r0.a(r6)     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x0030
            goto L_0x0039
        L_0x0030:
            if (r3 == 0) goto L_0x0037
        L_0x0032:
            r3.close()
        L_0x0035:
            r4 = 1
            goto L_0x005c
        L_0x0037:
            r4 = 1
            goto L_0x005c
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x003c:
            int[] r1 = defpackage.sng.a     // Catch:{ all -> 0x0061 }
            int r2 = r1.length     // Catch:{ all -> 0x0061 }
            r5 = 0
        L_0x0040:
            if (r5 >= r2) goto L_0x0057
            r6 = r1[r5]     // Catch:{ all -> 0x0061 }
            android.content.Context r8 = r0.k     // Catch:{ all -> 0x0061 }
            android.net.Uri r6 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r8, r6)     // Catch:{ all -> 0x0061 }
            boolean r6 = r0.a(r6)     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x0053
            int r5 = r5 + 1
            goto L_0x0040
        L_0x0053:
            if (r3 == 0) goto L_0x0056
            goto L_0x0032
        L_0x0056:
            goto L_0x0035
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            r3.close()
        L_0x005c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x0061:
            r0 = move-exception
            goto L_0x0065
        L_0x0063:
            r0 = move-exception
            r3 = 0
        L_0x0065:
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            goto L_0x006c
        L_0x006b:
            throw r0
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snj.a():java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((Boolean) obj);
    }

    /* access modifiers changed from: protected */
    public final void a(Boolean bool) {
        int i;
        iwq a2;
        sng sng = this.a;
        boolean booleanValue = bool.booleanValue();
        snn.b("Android Device Manager ringing [%s]", Boolean.valueOf(booleanValue));
        sng.h = sng.b.getStreamVolume(4);
        if (!jkr.b() || (a2 = iwq.a(sng.k)) == null) {
            i = 0;
        } else {
            i = a2.c();
        }
        if (i == 3 || i == 0) {
            int ringerMode = sng.b.getRingerMode();
            sng.i = ringerMode;
            if (ringerMode != 2) {
                try {
                    sng.b.setRingerMode(2);
                } catch (SecurityException e) {
                    smh.a(new avuj[]{avuj.GMS_PERMISSION_DENIED}, (Location) null, (avtx) null, (avty) null, (String) smo.l.a(), (avue) null, snh.a(sng.k), (String) null, (Response.Listener) null, (Response.ErrorListener) null);
                }
            }
        }
        AudioManager audioManager = sng.b;
        audioManager.setStreamVolume(4, audioManager.getStreamMaxVolume(4), 0);
        if (booleanValue) {
            try {
                sng.c.setOnErrorListener(sng);
                sng.c.setOnPreparedListener(sng);
                int i2 = Build.VERSION.SDK_INT;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(4);
                sng.c.setAudioAttributes(builder.build());
                sng.c.setLooping(true);
                sng.c.prepareAsync();
            } catch (IllegalStateException e2) {
                snn.a("Error preparing ringtone.", new Object[0]);
                sng.j.b();
            }
        } else {
            sng.d = new snf();
            sng.d.start();
        }
        new qvr().postDelayed(this.a.f, 300000);
    }
}
