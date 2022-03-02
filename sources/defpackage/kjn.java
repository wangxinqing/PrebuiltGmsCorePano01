package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.model.File;
import java.io.InputStream;

/* renamed from: kjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kjn {
    public static final File a(InputStream inputStream) {
        File file = new File();
        try {
            new jas().a(inputStream, (jag) file);
            return file;
        } catch (IllegalStateException e) {
            throw new kjj("Failed to process contents", e);
        } catch (jaq e2) {
            throw new kjj("Failed to process contents", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.URL a(java.lang.String r4, java.util.Map r5) {
        /*
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ MalformedURLException -> 0x0052 }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.String r1 = "fields"
            java.lang.Class<com.google.android.gms.drive.internal.model.File> r2 = com.google.android.gms.drive.internal.model.File.class
            r3 = 0
            java.lang.String r2 = defpackage.lnn.a((java.lang.Class) r2, (boolean) r3)     // Catch:{ MalformedURLException -> 0x0052 }
            r0.appendQueryParameter(r1, r2)     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.String r1 = defpackage.lnp.a()     // Catch:{ MalformedURLException -> 0x0052 }
            if (r1 != 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            defpackage.lnp.a(r0)     // Catch:{ MalformedURLException -> 0x0052 }
        L_0x001e:
            java.util.Set r5 = r5.entrySet()     // Catch:{ MalformedURLException -> 0x0052 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ MalformedURLException -> 0x0052 }
        L_0x0026:
            boolean r1 = r5.hasNext()     // Catch:{ MalformedURLException -> 0x0052 }
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r5.next()     // Catch:{ MalformedURLException -> 0x0052 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ MalformedURLException -> 0x0052 }
            r0.appendQueryParameter(r2, r1)     // Catch:{ MalformedURLException -> 0x0052 }
            goto L_0x0026
        L_0x0042:
            android.net.Uri r5 = r0.build()     // Catch:{ MalformedURLException -> 0x0052 }
            java.lang.String r4 = r5.toString()     // Catch:{ MalformedURLException -> 0x0052 }
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0050 }
            r5.<init>(r4)     // Catch:{ MalformedURLException -> 0x0050 }
            return r5
        L_0x0050:
            r5 = move-exception
            goto L_0x0053
        L_0x0052:
            r5 = move-exception
        L_0x0053:
            kjj r0 = new kjj
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Invalid URI: "
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0067
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            goto L_0x006b
        L_0x0067:
            java.lang.String r4 = r1.concat(r4)
        L_0x006b:
            r0.<init>(r4, r5)
            goto L_0x0070
        L_0x006f:
            throw r0
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjn.a(java.lang.String, java.util.Map):java.net.URL");
    }

    public final kjm a(kjl kjl, lsm lsm, lfp lfp) {
        return a(kjl, lsm, lfp, true);
    }

    public final kjm a(kjl kjl, lsm lsm, lfp lfp, boolean z) {
        kjm kjm;
        kjl kjl2 = kjl;
        lsm lsm2 = lsm;
        Context context = lsm2.b;
        kht kht = new kht();
        if (z) {
            kjm = kjb.a(context, kjl, lsm2.k, lsm2.d, kht, lsm2.r, lsm2.s, lsm2.t, lfp, this);
        } else {
            kjm = null;
        }
        if (kjm == null) {
            kjd kjd = lsm2.t;
            kjm = kjg.a(context, kjl2, kht, this);
        }
        if (kjm == null) {
            kjm = kjh.a(context, kjl2, kht, this);
        }
        if (kjm != null) {
            return kjm;
        }
        String valueOf = String.valueOf(kjl);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("No uploader found:");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
