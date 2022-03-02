package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afpi {
    public final Context a;
    public final amri b;
    private final aekn c;
    private final afmh d;
    private final Executor e;

    public afpi(Context context, aekn aekn, afmh afmh, amri amri, Executor executor) {
        this.a = context;
        this.c = aekn;
        this.d = afmh;
        this.b = amri;
        this.e = executor;
    }

    static String d(aflf aflf) {
        return Base64.encodeToString(aflf.k(), 3);
    }

    /* access modifiers changed from: package-private */
    public final afkr a(aflf aflf) {
        return (afkr) afst.a(afst.a(this.a, "gms_icing_mdd_groups", this.b), d(aflf), (auef) afkr.m.c(7));
    }

    public final aorr b() {
        return aopr.a(a(), (aoqb) new afpg(this), this.e);
    }

    /* access modifiers changed from: package-private */
    public final aorr c(aflf aflf) {
        return aorl.a((Object) (aflg) afst.a(afst.a(this.a, "gms_icing_mdd_group_key_properties", this.b), d(aflf), (auef) aflg.c.c(7)));
    }

    public final void e() {
        d().delete();
    }

    public final aorr f() {
        afst.a(this.a, "gms_icing_mdd_groups", this.b).edit().clear().commit();
        afst.a(this.a, "gms_icing_mdd_group_key_properties", this.b).edit().clear().commit();
        e();
        return aorl.a((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final File d() {
        amri amri = this.b;
        String str = "gms_icing_mdd_garbage_file";
        if (amri != null && amri.a()) {
            String valueOf = String.valueOf((String) this.b.b());
            str = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
        return new File(this.a.getFilesDir(), str);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(aflf aflf) {
        return afst.a(afst.a(this.a, "gms_icing_mdd_groups", this.b), d(aflf));
    }

    /* access modifiers changed from: package-private */
    public final aorr a() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a2 = afst.a(this.a, "gms_icing_mdd_groups", this.b);
        SharedPreferences.Editor editor = null;
        for (String next : a2.getAll().keySet()) {
            try {
                arrayList.add((aflf) afst.a(next, (auef) aflf.f.c(7)));
            } catch (auda e2) {
                String valueOf = String.valueOf(next);
                throw new afph(valueOf.length() == 0 ? new String("Failed to deserialize key:") : "Failed to deserialize key:".concat(valueOf), e2);
            } catch (afph e3) {
                String valueOf2 = String.valueOf(next);
                afsh.a((Throwable) e3, valueOf2.length() == 0 ? new String("Failed to deserialize groupKey:") : "Failed to deserialize groupKey:".concat(valueOf2));
                this.d.a("Failed to deserialize groupKey", e3);
                if (editor == null) {
                    editor = a2.edit();
                }
                editor.remove(next);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return aorl.a((Object) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List c() {
        /*
            r8 = this;
            java.lang.String r0 = "FileGroupsMetadata"
            java.io.File r1 = r8.d()
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0058 }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0058 }
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch:{ IllegalArgumentException -> 0x0049 }
            int r1 = (int) r5     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch:{ IOException -> 0x0035 }
            r5.read(r1)     // Catch:{ IOException -> 0x0035 }
            r1.rewind()     // Catch:{ IOException -> 0x0035 }
            java.lang.Class<afkr> r5 = defpackage.afkr.class
            afkr r6 = defpackage.afkr.m     // Catch:{ IOException -> 0x0035 }
            r7 = 7
            java.lang.Object r6 = r6.c(r7)     // Catch:{ IOException -> 0x0035 }
            auef r6 = (defpackage.auef) r6     // Catch:{ IOException -> 0x0035 }
            java.util.List r1 = defpackage.afss.a(r1, r5, r6)     // Catch:{ IOException -> 0x0035 }
            r2.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0041
        L_0x0033:
            r2 = move-exception
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L_0x0038:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.afsh.a((java.lang.Throwable) r2, (java.lang.String) r0, (java.lang.Object[]) r4)
        L_0x0041:
            if (r1 != 0) goto L_0x0048
            amzy r0 = defpackage.amzy.h()
            return r0
        L_0x0048:
            return r1
        L_0x0049:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.afsh.a((java.lang.Throwable) r1, (java.lang.String) r0, (java.lang.Object[]) r2)
            amzy r0 = defpackage.amzy.h()
            return r0
        L_0x0058:
            r0 = move-exception
            r1.getAbsolutePath()
            amzy r0 = defpackage.amzy.h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afpi.c():java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final aorr a(aflf aflf, afkr afkr) {
        return aorl.a((Object) Boolean.valueOf(afst.a(afst.a(this.a, "gms_icing_mdd_groups", this.b), d(aflf), (audx) afkr)));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(afkr afkr) {
        long a2 = (this.c.a() / 1000) + afkr.g;
        afko afko = afkr.b;
        if (afko == null) {
            afko = afko.g;
        }
        aucd aucd = (aucd) afko.c(5);
        aucd.a((aucj) afko);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        afko afko2 = (afko) aucd.b;
        afko2.a |= 1;
        afko2.b = a2;
        afko afko3 = (afko) aucd.i();
        aucd aucd2 = (aucd) afkr.c(5);
        aucd2.a((aucj) afkr);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        afkr afkr2 = (afkr) aucd2.b;
        afko3.getClass();
        afkr2.b = afko3;
        afkr2.a |= 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add((afkr) aucd2.i());
        return a((List) arrayList);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(List list) {
        File d2 = d();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(d2, true);
            try {
                ByteBuffer a2 = afss.a((Iterable) list);
                if (a2 != null) {
                    fileOutputStream.getChannel().write(a2);
                }
                fileOutputStream.close();
                return true;
            } catch (IOException e2) {
                afsh.a("IOException occurred while writing file groups.");
                return false;
            }
        } catch (FileNotFoundException e3) {
            afsh.a("File %s not found while writing.", (Object) d2.getAbsolutePath());
            return false;
        }
    }
}
