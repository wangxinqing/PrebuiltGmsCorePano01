package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: lu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lu extends ly {
    public final Typeface a(Context context, Resources resources, int i, String str, int i2) {
        int i3;
        int i4;
        try {
            FontFamily build = new FontFamily.Builder(new Font.Builder(resources, i).build()).build();
            if ((i2 & 1) == 0) {
                i3 = 400;
            } else {
                i3 = 700;
            }
            if ((i2 & 2) != 0) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            return new Typeface.CustomFallbackBuilder(build).setStyle(new FontStyle(i3, i4)).build();
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Typeface a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Typeface a(Context context, kx kxVar, Resources resources, int i) {
        int i2;
        int i3 = 0;
        FontFamily.Builder builder = null;
        for (ky kyVar : kxVar.a) {
            try {
                Font build = new Font.Builder(resources, kyVar.f).setWeight(kyVar.b).setSlant(kyVar.c ? 1 : 0).setTtcIndex(kyVar.e).setFontVariationSettings(kyVar.d).build();
                if (builder != null) {
                    builder.addFont(build);
                } else {
                    builder = new FontFamily.Builder(build);
                }
            } catch (IOException e) {
            }
        }
        if (builder == null) {
            return null;
        }
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i3)).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface a(android.content.Context r10, defpackage.nc[] r11, int r12) {
        /*
            r9 = this;
            android.content.ContentResolver r10 = r10.getContentResolver()
            int r0 = r11.length
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x0054
            r5 = r11[r3]
            android.net.Uri r6 = r5.a     // Catch:{ IOException -> 0x0050 }
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r6 = r10.openFileDescriptor(r6, r7, r2)     // Catch:{ IOException -> 0x0050 }
            if (r6 == 0) goto L_0x0051
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0044 }
            r7.<init>(r6)     // Catch:{ all -> 0x0044 }
            int r8 = r5.c     // Catch:{ all -> 0x0044 }
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch:{ all -> 0x0044 }
            boolean r8 = r5.d     // Catch:{ all -> 0x0044 }
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch:{ all -> 0x0044 }
            int r5 = r5.b     // Catch:{ all -> 0x0044 }
            android.graphics.fonts.Font$Builder r5 = r7.setTtcIndex(r5)     // Catch:{ all -> 0x0044 }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0038
            r4.addFont(r5)     // Catch:{ all -> 0x0044 }
            goto L_0x003e
        L_0x0038:
            android.graphics.fonts.FontFamily$Builder r7 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0044 }
            r7.<init>(r5)     // Catch:{ all -> 0x0044 }
            r4 = r7
        L_0x003e:
            r6.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0051
        L_0x0042:
            r5 = move-exception
            goto L_0x0051
        L_0x0044:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r6 = move-exception
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r6)     // Catch:{ IOException -> 0x0050 }
        L_0x004f:
            throw r7     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            r5 = move-exception
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0054:
            if (r4 == 0) goto L_0x007d
            r10 = r12 & 1
            if (r10 != 0) goto L_0x005d
            r10 = 400(0x190, float:5.6E-43)
            goto L_0x005f
        L_0x005d:
            r10 = 700(0x2bc, float:9.81E-43)
        L_0x005f:
            r11 = r12 & 2
            if (r11 == 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle
            r11.<init>(r10, r1)
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder
            android.graphics.fonts.FontFamily r12 = r4.build()
            r10.<init>(r12)
            android.graphics.Typeface$CustomFallbackBuilder r10 = r10.setStyle(r11)
            android.graphics.Typeface r10 = r10.build()
            return r10
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu.a(android.content.Context, nc[], int):android.graphics.Typeface");
    }

    /* access modifiers changed from: protected */
    public final nc a(nc[] ncVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
