package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.io.File;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsModuleFinder$ConfigUpdateIntentOperation extends IntentOperation {
    /* JADX INFO: finally extract failed */
    private final void a() {
        if (awxs.e()) {
            bkv.a((Context) this).a(true);
            blu a = blu.a((Context) this);
            if (a.a()) {
                File file = new File(a.b, "m");
                blz.b(file);
                blu.e.readLock().lock();
                try {
                    bpe bpe = a.j().c;
                    blu.e.readLock().unlock();
                    aucx aucx = bpe.d;
                    int size = aucx.size();
                    for (int i = 0; i < size; i++) {
                        blz.c(blz.b(file, ((bpf) aucx.get(i)).d));
                    }
                } catch (Throwable th) {
                    blu.e.readLock().unlock();
                    throw th;
                }
            }
        }
        hey.a(false);
        if (awxo.h()) {
            hey.a((Context) this);
        }
        FileApkIntentOperation.a((Context) this, true);
    }

    private final void b() {
        if (awxo.a.a().M() && aekv.a() && aekv.b(this)) {
            SharedPreferences.Editor edit = ikz.a(this).edit();
            ikz[] a = heh.a();
            for (int i = 0; i < 3; i++) {
                ikz ikz = a[i];
                String str = ikz.b;
                Object c = ikz.c();
                if (c != null) {
                    edit.putString(str, c.toString());
                } else {
                    edit.remove(str);
                }
            }
            if (!edit.commit()) {
                Log.w("GmsModuleFndr", "Failed to commit chimera values to direct boot cache");
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r13) {
        /*
            r12 = this;
            java.lang.String r0 = r13.getAction()
            defpackage.amtf.a((java.lang.Object) r0)
            int r1 = r0.hashCode()
            java.lang.String r2 = "android.intent.action.PACKAGE_REMOVED"
            java.lang.String r3 = "android.intent.action.PACKAGE_REPLACED"
            r4 = 0
            r5 = 1
            switch(r1) {
                case -905063602: goto L_0x0062;
                case -810471698: goto L_0x005a;
                case -678435495: goto L_0x0050;
                case 211362435: goto L_0x0046;
                case 267468725: goto L_0x003c;
                case 525384130: goto L_0x0034;
                case 798292259: goto L_0x002a;
                case 1544582882: goto L_0x0020;
                case 2069809336: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x006c
        L_0x0015:
            java.lang.String r1 = "com.google.android.chimera.IntentOperation.NEW_MODULE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 8
            goto L_0x006d
        L_0x0020:
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 3
            goto L_0x006d
        L_0x002a:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x0034:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r0 = 2
            goto L_0x006d
        L_0x003c:
            java.lang.String r1 = "android.intent.action.PACKAGE_DATA_CLEARED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 4
            goto L_0x006d
        L_0x0046:
            java.lang.String r1 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 6
            goto L_0x006d
        L_0x0050:
            java.lang.String r1 = "com.google.android.chimera.container.MODULE_SCAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 7
            goto L_0x006d
        L_0x005a:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            r0 = 5
            goto L_0x006d
        L_0x0062:
            java.lang.String r1 = "android.intent.action.LOCKED_BOOT_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            r0 = 0
            goto L_0x006d
        L_0x006c:
            r0 = -1
        L_0x006d:
            switch(r0) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00e6;
                case 2: goto L_0x0094;
                case 3: goto L_0x0094;
                case 4: goto L_0x009e;
                case 5: goto L_0x009e;
                case 6: goto L_0x008a;
                case 7: goto L_0x0085;
                case 8: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            return
        L_0x0071:
            r12.b()
            boolean r13 = defpackage.awxs.f()
            com.google.android.gms.chimera.container.FileApkIntentOperation.a((android.content.Context) r12, (boolean) r13)
            boolean r13 = defpackage.awxo.h()
            if (r13 == 0) goto L_0x0084
            defpackage.hey.a((android.content.Context) r12)
        L_0x0084:
            return
        L_0x0085:
            defpackage.hey.a((boolean) r5)
            return
        L_0x008a:
            r12.b()
            defpackage.hey.a((boolean) r5)
            com.google.android.gms.chimera.container.FileApkIntentOperation.a((android.content.Context) r12)
            return
        L_0x0094:
            java.lang.String r0 = "android.intent.extra.REPLACING"
            boolean r0 = r13.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x009e
            return
        L_0x009e:
            android.net.Uri r0 = r13.getData()
            r1 = 0
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = r0.getSchemeSpecificPart()
            goto L_0x00ab
        L_0x00aa:
            r0 = r1
        L_0x00ab:
            if (r0 == 0) goto L_0x00e5
            hey r6 = defpackage.hey.a()
            java.util.Set r9 = defpackage.hey.c(r12)
            java.lang.String r13 = r13.getAction()
            boolean r7 = r9.contains(r0)
            if (r7 != 0) goto L_0x00d8
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00ce
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r10 = r1
            goto L_0x00da
        L_0x00ce:
            java.util.Set r1 = defpackage.hey.b(r12)
            boolean r4 = r1.contains(r0)
            r10 = r1
            goto L_0x00da
        L_0x00d8:
            r10 = r1
            r4 = 1
        L_0x00da:
            if (r4 == 0) goto L_0x00e5
            r7 = 0
            r8 = 0
            r11 = 0
            r6.a((boolean) r7, (boolean) r8, (java.util.Set) r9, (java.util.Set) r10, (java.util.Set) r11)
            com.google.android.gms.chimera.container.FileApkIntentOperation.a((android.content.Context) r12)
        L_0x00e5:
            return
        L_0x00e6:
            boolean r13 = defpackage.aekv.a()
            if (r13 == 0) goto L_0x00f0
            r12.b()
            return
        L_0x00f0:
            r12.a()
            return
        L_0x00f4:
            r12.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.GmsModuleFinder$ConfigUpdateIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
