package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.internal.GetChangesRequest;
import com.google.android.gms.drive.internal.OnChangesResponse;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: kfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfw extends kez {
    private static final ith f = new ith("GetChangesOperation", "");
    private final GetChangesRequest g;

    public kfw(kec kec, GetChangesRequest getChangesRequest, kwg kwg) {
        super("GetChangesOperation", kec, kwg, 40);
        this.g = getChangesRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL);
    }

    public final void d(Context context) {
        int i;
        OnChangesResponse onChangesResponse;
        boolean z;
        lrw lrw;
        Cursor a;
        OnChangesResponse onChangesResponse2;
        Long l;
        int i2;
        kky a2;
        Cursor a3;
        njc.a((Object) this.g, "Invalid changes request: no request");
        GetChangesRequest getChangesRequest = this.g;
        ChangeSequenceNumber changeSequenceNumber = getChangesRequest.a;
        int i3 = getChangesRequest.b;
        njc.a((Object) changeSequenceNumber, "Invalid changes request: from sequence number cannot be null");
        njc.a(i3 > 0, "Invalid changes request: max results must be > 0");
        kec kec = this.a;
        HashSet hashSet = new HashSet(this.g.c);
        boolean z2 = this.g.d;
        khq khq = kec.d;
        kkz kkz = khq.a;
        Set a4 = lsn.a(khq, hashSet);
        if (changeSequenceNumber.b == kec.j.g() && changeSequenceNumber.c == kkz.b) {
            long j = changeSequenceNumber.a;
            kec.e.d();
            try {
                if (j < kec.e.b(kkz.a).b) {
                    kec.e.e();
                    i = i3;
                    onChangesResponse = null;
                } else {
                    kkb kkb = ((kjp) kec.e).a;
                    kqh kqh = kne.SEQUENCE_NUMBER.aB;
                    a = kkb.a("EntryView", new String[]{kqh.a()}, kqz.a(lrr.b(kkz.b), kqh.c(j)), String.valueOf(kqh.a()).concat(" ASC"), String.valueOf(i3));
                    if (!a.moveToLast()) {
                        a.close();
                        i = i3;
                        kqy a5 = kqz.a(lrr.b(kkz.b), kqh.e(j));
                        String[] strArr = {kqh.a()};
                        onChangesResponse2 = null;
                        a3 = kkb.a("EntryView", strArr, a5, (String) null);
                        if (a3.moveToFirst()) {
                            l = Long.valueOf(a3.getLong(0));
                            a3.close();
                        } else {
                            a3.close();
                            l = null;
                        }
                    } else {
                        i = i3;
                        onChangesResponse2 = null;
                        l = Long.valueOf(a.getLong(0));
                        a.close();
                    }
                    if (l != null) {
                        kqh kqh2 = kne.SEQUENCE_NUMBER.aB;
                        kqy a6 = kqz.a(kqh2.c(j), kqh2.b(l.longValue()));
                        String concat = String.valueOf(kqh2.a()).concat(" ASC");
                        kkz kkz2 = kkz;
                        khq khq2 = khq;
                        lrw a7 = kec.e.a(khq, a4, a6, concat, anfv.a, true, kec.l(), z2);
                        try {
                            kqy f2 = kne.IS_DELETED.aB.f();
                            if (z2) {
                                i2 = 2;
                            } else {
                                i2 = 2;
                                f2 = kqz.b(f2, kne.SUBSCRIBED.aB.c());
                            }
                            kkf kkf = kec.e;
                            kqy[] kqyArr = new kqy[i2];
                            kqyArr[0] = a6;
                            kqyArr[1] = f2;
                            a2 = kkf.a(khq2, a4, kqz.a(kqyArr));
                            ArrayList arrayList = new ArrayList(a2.size());
                            Iterator it = a2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((kmp) it.next()).g());
                            }
                            a2.close();
                            ChangeSequenceNumber changeSequenceNumber2 = new ChangeSequenceNumber(l.longValue(), kec.j.g(), kkz2.b);
                            OnChangesResponse onChangesResponse3 = new OnChangesResponse(a7.a, arrayList, changeSequenceNumber2, !changeSequenceNumber2.equals(kec.k()));
                            kec.e.f();
                            kec.e.e();
                            onChangesResponse = onChangesResponse3;
                        } catch (Throwable th) {
                            if (a7 != null) {
                                a7.a();
                            }
                            throw th;
                        }
                    } else {
                        kec.a.b("Invalid from sequence number");
                        kec.e.e();
                        onChangesResponse = onChangesResponse2;
                    }
                }
            } catch (Throwable th2) {
                kec.e.e();
                throw th2;
            }
        } else {
            i = i3;
            onChangesResponse = null;
        }
        lfq lfq = this.c;
        boolean z3 = onChangesResponse == null;
        lgc lgc = (lgc) lfq;
        lgc.k();
        if ((((ambk) lgc.e.b).a & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(!z, (Object) "Can't call setGetChangesDetails() twice");
        aucd aucd = lgc.e;
        aucd o = amaw.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        amaw amaw = (amaw) o.b;
        int i4 = amaw.a | 1;
        amaw.a = i4;
        amaw.b = i;
        amaw.a = i4 | 2;
        amaw.c = z3;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ambk ambk = (ambk) aucd.b;
        amaw amaw2 = (amaw) o.i();
        ambk ambk2 = ambk.K;
        amaw2.getClass();
        ambk.y = amaw2;
        ambk.a |= 4194304;
        if (onChangesResponse != null) {
            try {
                this.b.a(onChangesResponse);
                if (onChangesResponse.a) {
                    lrw = new lrw(onChangesResponse.b);
                    lrw.a();
                }
            } catch (RemoteException e) {
                jhg.a(e);
                f.b("GetChangesOperation", "Cannot pass complete response over binder!");
                a(Status.c);
                lrw = new lrw(onChangesResponse.b);
            } catch (Throwable th3) {
                new lrw(onChangesResponse.b).a();
                throw th3;
            }
        } else {
            throw new nja(1506, "Full sync using the Query API is required");
        }
    }
}
