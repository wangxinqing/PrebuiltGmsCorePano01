package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ksw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksw {
    public static final ith a = new ith("EventDistributor", "");
    public final ktm b;
    public final kdx c;
    public final ktd d;
    public final long e = ((Long) jzq.am.c()).longValue();
    public final int f = ((Integer) jzq.an.c()).intValue();
    public final kkf g;
    public final Executor h = jfm.b(9);
    public final lgy i;
    private final Context j;
    private final kth k;
    private final khx l;
    private final long m = ((Long) jzq.al.c()).longValue();
    private final int n = ((Integer) jzq.ak.c()).intValue();
    private final lfr o;
    private final ksz p;
    private final lsf q = new lsf(new kst(this), this.e, this.h, "EventDistributor");

    public ksw(Context context, ktm ktm, kdx kdx, ktd ktd, ksz ksz, kth kth, khx khx, jiq jiq, lgy lgy, lfr lfr, kkf kkf) {
        iva.a((Object) context);
        this.j = context;
        iva.a((Object) ktm);
        this.b = ktm;
        iva.a((Object) kdx);
        this.c = kdx;
        iva.a((Object) ksz);
        this.p = ksz;
        iva.a((Object) ktd);
        this.d = ktd;
        iva.a((Object) kth);
        this.k = kth;
        iva.a((Object) jiq);
        iva.a((Object) khx);
        this.l = khx;
        iva.a((Object) lgy);
        this.i = lgy;
        iva.a((Object) lfr);
        this.o = lfr;
        iva.a((Object) kkf);
        this.g = kkf;
    }

    private final ParcelFileDescriptor a(String str) {
        if (str != null) {
            return this.l.a(str);
        }
        return null;
    }

    public final void a() {
        this.q.a();
    }

    public final void a(DriveId driveId) {
        a((Set) anax.a((Object) driveId));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List, java.util.Collection] */
    public final void a(TransferProgressData transferProgressData, kmp kmp) {
        boolean a2 = this.p.a(transferProgressData);
        int i2 = transferProgressData.a;
        int i3 = 0;
        if (i2 == 0) {
            kdx kdx = this.c;
            TransferProgressEvent transferProgressEvent = new TransferProgressEvent(transferProgressData);
            ? a3 = kdx.a();
            int size = a3.size();
            while (i3 < size) {
                kec kec = ((kef) a3.get(i3)).d;
                if (kmp.a(kec.d)) {
                    kec.l.a(transferProgressEvent, kmp.g());
                }
                i3++;
            }
            if (a2) {
                this.b.a(transferProgressData);
            }
        } else if (i2 != 1) {
            a.c("EventDistributor", "Unexpected transfer type");
        } else {
            kdx kdx2 = this.c;
            TransferProgressEvent transferProgressEvent2 = new TransferProgressEvent(transferProgressData);
            ? a4 = kdx2.a();
            int size2 = a4.size();
            while (i3 < size2) {
                kec kec2 = ((kef) a4.get(i3)).d;
                if (kmp.a(kec2.d)) {
                    kec2.l.b(transferProgressEvent2, kmp.g());
                }
                i3++;
            }
            if (a2) {
                this.b.a(transferProgressData);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.util.Collection] */
    public final void a(Set set) {
        kdx kdx = this.c;
        ? a2 = kdx.a();
        int size = a2.size();
        int i2 = 0;
        while (i2 < size) {
            kec kec = ((kef) a2.get(i2)).d;
            kdx.b.d();
            try {
                kec.l.a(set);
                kdx.b.f();
                kdx.b.e();
                i2++;
            } catch (Throwable th) {
                kdx.b.e();
                throw th;
            }
        }
    }

    public final void a(kov kov) {
        MetadataBundle metadataBundle;
        ArrayList arrayList;
        String str;
        Cursor a2;
        klf klf;
        kov kov2 = kov;
        if (kov2.m >= 0) {
            try {
                iva.a((Object) kov);
                lsm a3 = lsm.a();
                JSONObject jSONObject = new JSONObject(kov2.c);
                kkf kkf = a3.d;
                khq g2 = kkf.g(kov2.b);
                if (g2 != null) {
                    DriveId g3 = kkf.a(g2, kov2.a).g();
                    if (jSONObject.has("modifiedMetadata")) {
                        metadataBundle = lbb.a(jSONObject.getJSONObject("modifiedMetadata"));
                    } else {
                        metadataBundle = null;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("trackingTags");
                    ArrayList arrayList2 = new ArrayList(jSONArray.length());
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList2.add(jSONArray.getString(i2));
                    }
                    if (jSONObject.has("actionTypes")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("actionTypes");
                        ArrayList arrayList3 = new ArrayList(jSONArray2.length());
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            arrayList3.add(kaj.a(jSONArray2.getString(i3)));
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = new ArrayList();
                    }
                    ksp ksp = new ksp(g3, lrv.a(jSONObject, "accountName"), jSONObject.optString("resolvedAccountName", "__unknown_account_name"), lrv.a(jSONObject, "baseContentHash"), lrv.a(jSONObject, "modifiedContentHash"), metadataBundle, arrayList2, arrayList, jSONObject.getInt("status"), lrv.a(jSONObject, "overrideServicePackageName"));
                    int i4 = kov2.e;
                    if (i4 < this.n) {
                        kwk kwk = new kwk(this, kov2, ksp);
                        String str2 = ksp.j;
                        if (str2 != null) {
                            str = str2;
                        } else {
                            kkf kkf2 = this.g;
                            long j2 = kov2.b;
                            kkb kkb = ((kjp) kkf2).a;
                            a2 = kkb.a(kli.a.b(), (String[]) null, kli.a.a.e(j2), (String) null);
                            if (a2.moveToFirst()) {
                                klf = klf.a(kkb, a2);
                                a2.close();
                            } else {
                                a2.close();
                                klf = null;
                            }
                            if (klf != null) {
                                str = klf.b.b;
                            } else {
                                a.c("EventDistributor", "Unable to find executing app for persisted event.");
                                a(kov2, (ksp) null, 2);
                                return;
                            }
                        }
                        CompletionEvent completionEvent = r11;
                        CompletionEvent completionEvent2 = new CompletionEvent(ksp.a, ksp.b, a(ksp.d), a(ksp.e), ksp.f, this.j, ksp.g, ksp.i, kwk);
                        String str3 = str;
                        a.a("Routing CompletionEvent: %s. To: %s", completionEvent, str3);
                        this.k.a(str3, (DriveEvent) completionEvent);
                        kov2.e = i4 + 1;
                        kov2.d = System.currentTimeMillis() + this.m;
                        kov.t();
                        return;
                    }
                    a(kov2, ksp, 1);
                    return;
                }
                throw new kcm((AppIdentity) null);
            } catch (IOException | kcm | kcs | JSONException e2) {
                Throwable th = e2;
                a.c("EventDistributor", String.format("%s extracting completion event from persisted event", new Object[]{th.getClass().getSimpleName()}), th);
                a(kov2, (ksp) null, 2);
            } catch (SQLException e3) {
                a.c("EventDistributor", "SQLException increasing persisted event attempts", e3);
                a(kov2, (ksp) null, 2);
            } catch (Throwable th2) {
                Throwable th3 = th2;
                a2.close();
                throw th3;
            }
        } else {
            a.c("EventDistributor", "Event to raise is not persisted yet");
        }
    }

    public final void a(kov kov, ksp ksp, int i2) {
        long j2 = kov.m;
        if (j2 >= 0) {
            int i3 = kov.f;
            lfq c2 = this.o.c();
            c2.j();
            c2.c(2, 26);
            khq g2 = this.g.g(kov.b);
            if (g2 != null) {
                c2.a(new CallingAppInfo(g2, 0));
            }
            if (ksp != null) {
                if (!ksp.c.equals("__unknown_account_name")) {
                    c2.a(ksp.c);
                }
                c2.a(ksp, i3, i2);
            } else {
                c2.a((ksp) null, i3, i2);
            }
            if (this.d.b(j2)) {
                c2.a();
            } else if (i2 != 1) {
                a.a("Persisted event %d: already deleted.", Long.valueOf(j2));
            } else {
                a.c("EventDistributor", "Error deleting persisted event");
            }
        } else {
            a.c("EventDistributor", "Event to delete is not persisted yet");
        }
    }

    public final void a(ksp ksp, khq khq) {
        kkb kkb;
        ksp ksp2 = ksp;
        try {
            DriveId driveId = ksp2.a;
            iva.a((Object) driveId);
            lsm a2 = lsm.a();
            kkb kkb2 = a2.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", ksp2.i);
            jSONObject.putOpt("accountName", ksp2.b);
            jSONObject.put("resolvedAccountName", ksp2.c);
            jSONObject.putOpt("overrideServicePackageName", ksp2.j);
            jSONObject.putOpt("baseContentHash", ksp2.d);
            jSONObject.putOpt("modifiedContentHash", ksp2.e);
            MetadataBundle metadataBundle = ksp2.f;
            if (metadataBundle != null) {
                jSONObject.put("modifiedMetadata", lbb.b(metadataBundle));
            }
            jSONObject.put("trackingTags", new JSONArray(ksp2.g));
            JSONArray jSONArray = new JSONArray();
            for (kaj kaj : ksp2.h) {
                khq khq2 = khq;
                kkb kkb3 = kkb2;
                jSONArray.put(kaj.y);
                kkb2 = kkb3;
            }
            jSONObject.put("actionTypes", jSONArray);
            String jSONObject2 = jSONObject.toString();
            klf b2 = a2.d.b(khq);
            kov kov = r4;
            kkb = kkb2;
            kov kov2 = new kov(kkb2, -1, knc.a(driveId.b), b2.m, jSONObject2, 0, 0, 0);
            kkb.b();
            kov.t();
            kov kov3 = kov;
            long j2 = kov3.m;
            ktd.a(kkb, j2, ksp2.d);
            ktd.a(kkb, j2, ksp2.e);
            kkb.f();
            kkb.d();
            this.h.execute(new ksu(this, kov3.m));
        } catch (SQLException | JSONException e2) {
            a.c("EventDistributor", "Exception persisting completion event", e2);
        } catch (Throwable th) {
            kkb.d();
            throw th;
        }
    }
}
