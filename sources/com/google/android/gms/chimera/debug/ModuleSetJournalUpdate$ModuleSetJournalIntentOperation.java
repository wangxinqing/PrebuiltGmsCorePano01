package com.google.android.gms.chimera.debug;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ModuleSetJournalUpdate$ModuleSetJournalIntentOperation extends IntentOperation {
    private static final Comparator a = hhq.a;

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, boolean z) {
        ou ouVar;
        byte[] bArr2 = bArr;
        if (bArr2 != null) {
            try {
                hhl hhl = (hhl) aucj.a((aucj) hhl.b, bArr2, aubs.b());
                hef a2 = hef.a((Context) this);
                hhl c = a2.c();
                ou ouVar2 = new ou();
                if (c != null) {
                    aucx aucx = c.a;
                    int size = aucx.size();
                    for (int i = 0; i < size; i++) {
                        hhp hhp = (hhp) aucx.get(i);
                        ouVar2.put(hhr.a(hhp), hhp);
                    }
                }
                if (z) {
                    ouVar = new ou();
                } else {
                    ouVar = ouVar2;
                }
                aucx aucx2 = hhl.a;
                int size2 = aucx2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    hhp hhp2 = (hhp) aucx2.get(i2);
                    String a3 = hhr.a(hhp2);
                    hhp hhp3 = (hhp) ouVar2.get(a3);
                    if (hhp3 != null) {
                        aucx aucx3 = hhp2.d;
                        aucd aucd = (aucd) hhp2.c(5);
                        aucd.a((aucj) hhp2);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        ((hhp) aucd.b).d = aucj.s();
                        aucd.F(aucx3);
                        aucd.F(hhp3.d);
                        if (((hhp) aucd.b).d.size() >= 2) {
                            ArrayList arrayList = new ArrayList();
                            hho hho = hho.c;
                            for (hho hho2 : Collections.unmodifiableList(((hhp) aucd.b).d)) {
                                int a4 = hhn.a(hho2.b);
                                int i3 = 1;
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                int a5 = hhn.a(hho.b);
                                if (a5 != 0) {
                                    i3 = a5;
                                }
                                if (a4 != i3) {
                                    arrayList.add(hho2);
                                    hho = hho2;
                                }
                            }
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            ((hhp) aucd.b).d = aucj.s();
                            aucd.F(arrayList);
                        }
                        hhr.a(aucd);
                        hhp2 = (hhp) aucd.i();
                    }
                    ouVar.put(a3, hhp2);
                }
                ArrayList arrayList2 = new ArrayList(ouVar.h);
                for (int i4 = 0; i4 < ouVar.h; i4++) {
                    arrayList2.add((hhp) ouVar.c(i4));
                }
                Collections.sort(arrayList2, a);
                aucd o = hhl.b.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hhl hhl2 = (hhl) o.b;
                hhl2.a();
                auab.a((Iterable) arrayList2, (List) hhl2.a);
                hhl hhl3 = (hhl) o.i();
                if (a2.f()) {
                    a2.a.edit().putString("Chimera.moduleSetJournal", jhy.b(hhl3.k())).commit();
                }
            } catch (auda e) {
                Log.w("ModuleSetJournalIntentOp", "Failed to parse module set journal.");
            }
        } else {
            Log.w("ModuleSetJournalIntentOp", "Ignoring null module set journal bytes.");
        }
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        boolean z = false;
        if ("com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("entries");
            if (intent.getIntExtra("isComprehensive", 0) != 0) {
                z = true;
            }
            a(byteArrayExtra, z);
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            ModuleManager moduleManager = ModuleManager.get(this);
            try {
                hhr hhr = new hhr();
                for (ModuleManager.ModuleSetInfo moduleSetInfo : moduleManager.getCurrentConfig().moduleSets) {
                    hhr.a(moduleSetInfo.moduleSetId, moduleSetInfo.moduleSetVersion, 2);
                }
                a(hhr.a(), false);
            } catch (InvalidConfigException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("Chimera module config error: ");
                sb.append(valueOf);
                Log.w("ModuleSetJournalIntentOp", sb.toString());
            }
        }
    }
}
