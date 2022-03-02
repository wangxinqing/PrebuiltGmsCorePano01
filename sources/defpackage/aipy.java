package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.location.internal.server.NanoAppUpdaterChimeraGcmTaskService;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: aipy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipy implements Runnable {
    private final Context a;
    private final int b;

    public aipy(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public final void run() {
        Context context = this.a;
        if (!aiqo.b()) {
            qwq.a(context).a("LocationNanoAppUpdate", "com.google.android.location.internal.NanoAppUpdaterGcmTaskService");
        } else if (aiqo.c()) {
            NanoAppUpdaterChimeraGcmTaskService.a(context, aydr.a.a().nanoAppNewVersionCheckPeriodSec());
        } else {
            NanoAppUpdaterChimeraGcmTaskService.a(context, aydr.a.a().nanoAppNewVersionIdleCheckPeriodSec());
        }
        if (aiqo.c()) {
            Context context2 = this.a;
            aipx aipx = new aipx(context2, rxu.a(context2), new agzm(new jfz(1, 10), new agzs(Arrays.asList(new ahcn[]{new tbt(context2)}), Collections.emptyList(), Collections.emptyList())), new aipq().a(context2), aipf.a(context2), aiqo.a());
            int i = this.b;
            try {
                Map a2 = aipx.a();
                HashMap hashMap = new HashMap();
                for (Long longValue : rlt.d(aipx.a)) {
                    long longValue2 = longValue.longValue();
                    Uri a3 = rlt.a(aipx.a, longValue2);
                    if (a3 != null) {
                        hashMap.put(Long.valueOf(longValue2), a3);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (aipx.c.a(((Long) entry.getKey()).longValue()) != null) {
                        hashMap2.put((Long) entry.getKey(), (Uri) entry.getValue());
                    }
                }
                ArrayList<aipw> arrayList = new ArrayList<>();
                for (Map.Entry entry2 : a2.entrySet()) {
                    Uri uri = (Uri) hashMap2.get(entry2.getKey());
                    if (i != 1) {
                        if (uri != null && uri.equals(entry2.getValue())) {
                            arrayList.add(new aipw(1, ((Long) entry2.getKey()).longValue(), (Uri) entry2.getValue()));
                        }
                    }
                    arrayList.add(new aipw(2, ((Long) entry2.getKey()).longValue(), (Uri) entry2.getValue()));
                }
                for (Long longValue3 : iko.b(hashMap2.keySet(), a2.keySet())) {
                    arrayList.add(new aipw(3, longValue3.longValue(), (Uri) null));
                }
                for (aipw aipw : arrayList) {
                    int i2 = aipw.a;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            aipx.a(aipw.b, 2);
                        } else {
                            try {
                                agzm agzm = aipx.b;
                                byte[] a4 = anmr.a((InputStream) agzm.b.b(new agzl(agzm, aipw.c, ahcj.a(), new agzk[0])).get());
                                if (a4 != null) {
                                    if (a4.length != 0) {
                                        aipx.a(aipw.b, 1);
                                        aipx.a(aipw, a4);
                                    }
                                }
                                Object[] objArr = {"Updater:", Long.valueOf(aipw.b)};
                            } catch (IOException | InterruptedException | ExecutionException e) {
                                Object[] objArr2 = {"Updater:", Long.valueOf(aipw.b), e};
                            }
                        }
                    }
                }
                if (i == 1) {
                    ob obVar = new ob();
                    for (arnh a5 : aipx.c.b()) {
                        obVar.add(Long.valueOf(a5.a()));
                    }
                    arnc arnc = aipx.d;
                    ((aiqo) arnc).c.execute(new aiqg((aiqo) arnc, obVar));
                } else {
                    for (aipw aipw2 : arrayList) {
                        if (aipw2.a == 2) {
                            if (aipw2.d && aipx.c.a(aipw2.b) != null) {
                                Object[] objArr3 = {"Updater:", Long.valueOf(aipw2.b)};
                                arnc arnc2 = aipx.d;
                                ((aiqo) arnc2).c.execute(new aiqi((aiqo) arnc2, aipw2.b));
                            } else {
                                Object[] objArr4 = {"Updater:", Long.valueOf(aipw2.b)};
                                arnc arnc3 = aipx.d;
                                ((aiqo) arnc3).c.execute(new aiqj((aiqo) arnc3, aipw2.b));
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (aipw aipw3 : arrayList) {
                    int i3 = aipw3.a;
                    if (i3 == 1) {
                        arrayList2.add(Long.valueOf(aipw3.b));
                    } else if (i3 != 2) {
                        rlt.b(aipx.a, aipw3.b);
                    } else if (aipw3.d) {
                        arrayList2.add(Long.valueOf(aipw3.b));
                        rlt.a(aipx.a, aipw3.b, aipw3.c);
                    }
                }
                rlt.a(aipx.a, (Iterable) arrayList2);
                if (aydr.c()) {
                    List<arnh> b2 = aipx.c.b();
                    int a6 = aipx.c.a();
                    aipf aipf = aipx.e;
                    if (aydr.c()) {
                        aucd o = anyj.d.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        anyj anyj = (anyj) o.b;
                        anyj.a |= 1;
                        anyj.c = a6;
                        if (b2 != null) {
                            for (arnh arnh : b2) {
                                aucd o2 = anyg.d.o();
                                long a7 = arnh.a();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                anyg anyg = (anyg) o2.b;
                                anyg.a |= 1;
                                anyg.b = a7;
                                int c = arnh.c();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                anyg anyg2 = (anyg) o2.b;
                                anyg2.a |= 2;
                                anyg2.c = c;
                                anyg anyg3 = (anyg) o2.i();
                                if (o.c) {
                                    o.c();
                                    o.c = false;
                                }
                                anyj anyj2 = (anyj) o.b;
                                anyg3.getClass();
                                if (!anyj2.b.a()) {
                                    anyj2.b = aucj.a(anyj2.b);
                                }
                                anyj2.b.add(anyg3);
                            }
                        }
                        aucd o3 = anyi.g.o();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        anyi anyi = (anyi) o3.b;
                        anyi.b = 1;
                        anyi.a |= 1;
                        anyj anyj3 = (anyj) o.i();
                        anyj3.getClass();
                        anyi.c = anyj3;
                        anyi.a |= 2;
                        aipf.a(o3);
                    }
                }
            } catch (IOException e2) {
                Object[] objArr5 = {"Updater:", e2};
            }
        }
    }
}
