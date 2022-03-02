package defpackage;

import android.content.Context;
import android.hardware.location.NanoAppFilter;
import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aipx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aipx {
    public final Context a;
    public final agzm b;
    public final arnd c;
    public final arnc d;
    public final aipf e;
    private final rxy f;

    public aipx(Context context, rxy rxy, agzm agzm, arnd arnd, aipf aipf, arnc arnc) {
        this.a = context;
        this.f = rxy;
        this.b = agzm;
        this.c = arnd;
        this.e = aipf;
        this.d = arnc;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        ArrayList a2 = anda.a((Object[]) aydr.a.a().nanoAppGroupList().trim().split("\\s*,\\s*"));
        a2.remove("");
        if (!a2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f.a((String) a2.get(i), "com.google.android.gms"));
            }
            try {
                acws.a(acws.a((Collection) arrayList), aydr.a.a().nanoAppMddTimeoutMs(), TimeUnit.MILLISECONDS);
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    List<MddFile> list = ((FileGroupResponse) ((acwa) arrayList.get(i2)).d()).c;
                    if (!list.isEmpty()) {
                        for (MddFile mddFile : list) {
                            try {
                                hashMap.put(Long.valueOf(Long.parseLong(mddFile.a, 16)), Uri.parse(mddFile.b));
                            } catch (NumberFormatException e2) {
                                Object[] objArr = {"Updater:", mddFile.a, e2};
                            }
                        }
                    }
                }
                return hashMap;
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                Object[] objArr2 = {"Updater:", e3};
            }
        }
        return hashMap;
    }

    public final void a(long j, int i) {
        arot arot;
        arnr arnr = (arnr) this.c;
        int[] findNanoAppOnHub = arnr.e.findNanoAppOnHub(arnr.g, new NanoAppFilter(j, 0, -1, -1));
        arns arns = null;
        if (findNanoAppOnHub != null && findNanoAppOnHub.length == 1) {
            arns = new arns(j, findNanoAppOnHub[0], arnr.e, arnr, arnr.o, arnr.h);
        }
        if (arns != null) {
            this.d.a(j, i);
            arnr arnr2 = (arnr) arns.d;
            if (!arnr2.n) {
                arnz arnz = arnr2.i;
                arot arot2 = new arot(arnz, arnz.j, arns.b);
                arnz.c.execute(arot2);
                arot = arot2;
            } else {
                arot = arnr2.j.a(arnr2.f, (arnh) arns);
            }
            try {
                ((Integer) arot.get(180, TimeUnit.SECONDS)).intValue();
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
                Object[] objArr = {"Updater:", Long.valueOf(j), e2};
                aipf aipf = this.e;
                String exc = e2.toString();
                if (aydr.c()) {
                    String hexString = Long.toHexString(j);
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 11 + String.valueOf(exc).length());
                    sb.append("Unload: 0x");
                    sb.append(hexString);
                    sb.append(" ");
                    sb.append(exc);
                    aipf.a(sb.toString());
                }
            }
        }
    }

    public final void a(aipw aipw, byte[] bArr) {
        try {
            aipw.d = ((Integer) this.c.a(aipw.b, bArr).get(180, TimeUnit.SECONDS)).intValue() == 0;
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e2) {
            Object[] objArr = {"Updater:", Long.valueOf(aipw.b), e2};
            aipf aipf = this.e;
            long j = aipw.b;
            String exc = e2.toString();
            if (aydr.c()) {
                String hexString = Long.toHexString(j);
                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 9 + String.valueOf(exc).length());
                sb.append("Load: 0x");
                sb.append(hexString);
                sb.append(" ");
                sb.append(exc);
                aipf.a(sb.toString());
            }
        }
    }
}
