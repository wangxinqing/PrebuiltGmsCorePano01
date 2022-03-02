package defpackage;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.ContextHubTransaction;
import android.hardware.location.NanoAppBinary;
import android.hardware.location.NanoAppState;
import android.os.Handler;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: arof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arof extends aroc {
    public final arod a;
    public final aroo b = new aroo();
    private final arnd c;
    private final ContextHubManager d;
    private final Handler e;
    private final HashMap f = new HashMap();
    private final ThreadPoolExecutor g;
    private final AtomicInteger h = new AtomicInteger(0);
    private final LongSparseArray i = new LongSparseArray();
    private final aipf j;

    public arof(arnd arnd, ContextHubManager contextHubManager, arod arod, aipf aipf, Handler handler) {
        this.c = arnd;
        this.d = contextHubManager;
        this.a = arod;
        this.j = aipf;
        this.e = handler;
        this.g = new jfz(1, 9);
        for (ContextHubInfo contextHubInfo : a()) {
            this.f.put(Integer.valueOf(contextHubInfo.getId()), contextHubManager.createClient(contextHubInfo, new aroe(this), this.g));
        }
    }

    private final List b(ContextHubInfo contextHubInfo) {
        ContextHubTransaction.Response response;
        try {
            response = this.d.queryNanoApps(contextHubInfo).waitForResponse(5, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            int id = contextHubInfo.getId();
            StringBuilder sb = new StringBuilder(65);
            sb.append("InterruptedException while querying nanoapps (hub id=");
            sb.append(id);
            sb.append(")");
            sb.toString();
            response = null;
        } catch (TimeoutException e3) {
            int id2 = contextHubInfo.getId();
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("TimeoutException while querying nanoapps (hub id=");
            sb2.append(id2);
            sb2.append(")");
            sb2.toString();
            response = null;
        }
        if (response == null) {
            return null;
        }
        if (response.getResult() == 0) {
            return (List) response.getContents();
        }
        int id3 = contextHubInfo.getId();
        int result = response.getResult();
        StringBuilder sb3 = new StringBuilder(62);
        sb3.append("Failed to query nanoapps (hub id=");
        sb3.append(id3);
        sb3.append(") code ");
        sb3.append(result);
        sb3.toString();
        return null;
    }

    public final arnk a(ContextHubInfo contextHubInfo, arnh arnh) {
        amrl.a((Object) contextHubInfo);
        amrl.a((Object) arnh);
        return new aroh(this.d.unloadNanoApp(contextHubInfo, ((arns) arnh).a));
    }

    public final arnk a(ContextHubInfo contextHubInfo, arnh arnh, int i2, int i3, byte[] bArr) {
        byte[] bArr2;
        amrl.a((Object) contextHubInfo);
        amrl.a((Object) arnh);
        if (bArr == null) {
            bArr2 = new byte[0];
        } else {
            bArr2 = bArr;
        }
        ContextHubClient contextHubClient = (ContextHubClient) this.f.get(Integer.valueOf(contextHubInfo.getId()));
        if (contextHubClient != null) {
            aror aror = new aror(contextHubClient, contextHubInfo, arnh, this.h.getAndIncrement(), i2, i3, bArr2);
            this.g.execute(aror);
            return aror;
        }
        String valueOf = String.valueOf(contextHubInfo);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Invalid hub: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Integer b(ContextHubInfo contextHubInfo, arnh arnh) {
        amrl.a((Object) contextHubInfo);
        amrl.a((Object) arnh);
        List b2 = b(contextHubInfo);
        Integer num = null;
        if (b2 != null) {
            Iterator it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NanoAppState nanoAppState = (NanoAppState) it.next();
                if (nanoAppState.getNanoAppId() == ((arns) arnh).a) {
                    num = Integer.valueOf((int) nanoAppState.getNanoAppVersion());
                    break;
                }
            }
            if (num == null) {
                String hexString = Long.toHexString(((arns) arnh).a);
                int id = contextHubInfo.getId();
                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 47);
                sb.append("Nanoapp (0x");
                sb.append(hexString);
                sb.append(") not loaded on hub (id=");
                sb.append(id);
                sb.append(")");
                sb.toString();
                return num;
            }
        }
        return num;
    }

    public final arnk a(ContextHubInfo contextHubInfo, byte[] bArr) {
        amrl.a((Object) contextHubInfo);
        amrl.a((Object) bArr);
        return new aroh(this.d.loadNanoApp(contextHubInfo, new NanoAppBinary(bArr)));
    }

    public final arns a(long j2) {
        arns arns;
        synchronized (this.i) {
            if (this.i.get(j2) == null) {
                this.i.put(j2, new arns(j2, this.d, this.c, this.j, this.e));
            }
            arns = (arns) this.i.get(j2);
        }
        return arns;
    }

    public final List a() {
        return this.d.getContextHubs();
    }

    public final List a(ContextHubInfo contextHubInfo) {
        amrl.a((Object) contextHubInfo);
        ArrayList arrayList = new ArrayList();
        List<NanoAppState> b2 = b(contextHubInfo);
        if (b2 != null) {
            for (NanoAppState nanoAppId : b2) {
                arrayList.add(a(nanoAppId.getNanoAppId()));
            }
        }
        return arrayList;
    }
}
