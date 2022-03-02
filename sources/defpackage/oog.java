package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.StatFs;
import android.util.Log;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: oog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oog {
    VolleyError a;
    private final Context b;
    private final ofn c;
    private final Response.ErrorListener d;
    private final StatFs e = new StatFs(this.f);
    private final String f;
    private final okc g;

    public oog(Context context, ofn ofn, okc okc) {
        this.b = context;
        this.f = context.getCacheDir().getAbsolutePath();
        this.c = ofn;
        this.g = okc;
        this.a = null;
        this.d = new oof(this);
    }

    private final long b() {
        this.e.restat(this.f);
        int i = Build.VERSION.SDK_INT;
        return this.e.getFreeBlocksLong() * this.e.getBlockSizeLong();
    }

    public final void a() {
        String str;
        ArrayList arrayList = new ArrayList();
        String[] a2 = ofx.a(axnl.a.a().a());
        List<PackageInfo> installedPackages = this.b.getPackageManager().getInstalledPackages(0);
        nz nzVar = new nz();
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            nzVar.put(packageInfo.packageName, packageInfo.versionName);
        }
        long max = (Math.max(b() - axmj.r(), 0) / axmj.s()) / axmj.a.a().af();
        for (int i2 = 0; i2 < a2.length && ((long) arrayList.size()) != max; i2++) {
            if (nzVar.containsKey(a2[i2])) {
                aucd o = olw.d.o();
                String str2 = a2[i2];
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                olw olw = (olw) o.b;
                str2.getClass();
                olw.a |= 1;
                olw.b = str2;
                String str3 = (String) nzVar.get(a2[i2]);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                olw olw2 = (olw) o.b;
                str3.getClass();
                olw2.a |= 2;
                olw2.c = str3;
                arrayList.add((olw) o.i());
            }
        }
        olw[] olwArr = (olw[]) arrayList.toArray(new olw[0]);
        if (olwArr.length != 0) {
            try {
                avnx a3 = oms.a(this.b, olwArr, this.d, this.g);
                for (int i3 = 0; i3 < a3.a.size(); i3++) {
                    avny avny = (avny) a3.a.get(i3);
                    avoa avoa = avny.a;
                    if (avoa == null) {
                        avoa = avoa.b;
                    }
                    String str4 = avoa.a;
                    int i4 = 0;
                    for (avnw avnw : avny.b) {
                        i4 += avnw.b.size();
                    }
                    if (b() - axmj.r() > ((long) i4) * axmj.s()) {
                        for (avnw avnw2 : avny.b) {
                            String str5 = avnw2.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (avnz avnz : avnw2.b) {
                                avof avof = avnz.a;
                                if (avof == null) {
                                    avof = avof.c;
                                }
                                avon avon = avnz.b;
                                if (avon == null) {
                                    avon = avon.e;
                                }
                                String str6 = avof.a;
                                avoe avoe = avof.b;
                                if (avoe == null) {
                                    avoe = avoe.d;
                                }
                                String str7 = avoe.a;
                                avoe avoe2 = avof.b;
                                if (avoe2 == null) {
                                    avoe2 = avoe.d;
                                }
                                String str8 = avoe2.b;
                                avoe avoe3 = avof.b;
                                if (avoe3 == null) {
                                    avoe3 = avoe.d;
                                }
                                oab b2 = oab.b(str6, str7, str8, avoe3.c, avon.d);
                                arrayList2.add(b2);
                                String d2 = b2.d();
                                String str9 = avon.b;
                                avom avom = avon.c;
                                if (avom == null) {
                                    avom = avom.b;
                                }
                                this.c.a(oab.a(d2, str9, avom.a, avon.a, avon.d), str4);
                            }
                            ofn ofn = this.c;
                            oab a4 = oab.a(str5, false);
                            nz nzVar2 = new nz();
                            nzVar2.put(a4.b, a4);
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                oab oab = (oab) arrayList2.get(i5);
                                a4.a(oab);
                                nzVar2.put(oab.b, oab);
                            }
                            ofn.a(new omf(a4.b, nzVar2, 154), str4);
                        }
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                VolleyError volleyError = this.a;
                if (volleyError != null) {
                    str = volleyError.toString();
                } else {
                    str = "Timeout Error.";
                }
                String valueOf = String.valueOf(str);
                Log.e("gH_GetOffHelpContTask", valueOf.length() == 0 ? new String("Error while making network request.\n") : "Error while making network request.\n".concat(valueOf), e2);
                VolleyError volleyError2 = this.a;
                if (volleyError2 != null) {
                    throw volleyError2;
                }
                throw new TimeoutException();
            }
        }
    }
}
