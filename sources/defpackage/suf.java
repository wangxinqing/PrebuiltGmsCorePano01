package defpackage;

import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* renamed from: suf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class suf extends bhw implements sug {
    public final sze a;
    private Boolean b;
    private String c;

    public suf() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if ("com.google.android.gms".equals(this.c)) {
                            z2 = true;
                        } else if (!jll.a(this.a.n(), Binder.getCallingUid())) {
                            z2 = hya.a(this.a.n()).a(Binder.getCallingUid());
                        } else {
                            z2 = true;
                        }
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.E().c.a("Measurement Service called with invalid calling package. appId", sut.a(str));
                    throw e;
                }
            }
            if (this.c == null) {
                if (hxz.a(this.a.n(), Binder.getCallingUid(), str)) {
                    this.c = str;
                }
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.E().c.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void c(AppMetadata appMetadata) {
        iva.a((Object) appMetadata);
        a(appMetadata.a, false);
        szj p = this.a.p();
        String str = appMetadata.b;
        String str2 = appMetadata.r;
        String str3 = appMetadata.v;
        p.c(str, str2);
    }

    public final String b(AppMetadata appMetadata) {
        c(appMetadata);
        return this.a.c(appMetadata);
    }

    public suf(sze sze, String str) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        iva.a((Object) sze);
        this.a = sze;
        this.c = str;
    }

    public final List a(String str, String str2, AppMetadata appMetadata) {
        c(appMetadata);
        try {
            return (List) this.a.F().a((Callable) new svz(this, appMetadata, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.E().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.F().a((Callable) new swa(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            if (!ayjn.b() || !this.a.d().b(str, sud.aJ)) {
                this.a.E().c.a("Failed to get conditional user properties", e);
            } else {
                this.a.E().c.a("Failed to get conditional user properties as", e);
            }
            return Collections.emptyList();
        }
    }

    public final List a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<szi> list = (List) this.a.F().a((Callable) new svy(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (szi szi : list) {
                if (!z) {
                    if (szj.f(szi.c)) {
                    }
                }
                arrayList.add(new UserAttributeParcel(szi));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!ayjn.b() || !this.a.d().b(str, sud.aJ)) {
                this.a.E().c.a("Failed to get user attributes. appId", sut.a(str), e);
            } else {
                this.a.E().c.a("Failed to get user properties as. appId", sut.a(str), e);
            }
            return Collections.emptyList();
        }
    }

    public final List a(String str, String str2, boolean z, AppMetadata appMetadata) {
        c(appMetadata);
        try {
            List<szi> list = (List) this.a.F().a((Callable) new svx(this, appMetadata, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (szi szi : list) {
                if (!z) {
                    if (szj.f(szi.c)) {
                    }
                }
                arrayList.add(new UserAttributeParcel(szi));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!ayjn.b() || !this.a.d().b(appMetadata.a, sud.aJ)) {
                this.a.E().c.a("Failed to get user attributes. appId", sut.a(appMetadata.a), e);
            } else {
                this.a.E().c.a("Failed to query user properties. appId", sut.a(appMetadata.a), e);
            }
            return Collections.emptyList();
        }
    }

    public final void a(long j, String str, String str2, String str3) {
        a((Runnable) new swj(this, str2, str3, str, j));
    }

    public final void a(AppMetadata appMetadata) {
        c(appMetadata);
        a((Runnable) new swi(this, appMetadata));
    }

    public final void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        iva.a((Object) conditionalUserPropertyParcel);
        iva.a((Object) conditionalUserPropertyParcel.c);
        a(conditionalUserPropertyParcel.a, true);
        a((Runnable) new svw(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    public final void a(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        iva.a((Object) conditionalUserPropertyParcel);
        iva.a((Object) conditionalUserPropertyParcel.c);
        c(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.a = appMetadata.a;
        a((Runnable) new swk(this, conditionalUserPropertyParcel2, appMetadata));
    }

    public final void a(EventParcel eventParcel, AppMetadata appMetadata) {
        iva.a((Object) eventParcel);
        c(appMetadata);
        a((Runnable) new swd(this, eventParcel, appMetadata));
    }

    public final void a(EventParcel eventParcel, String str, String str2) {
        iva.a((Object) eventParcel);
        iva.c(str);
        a(str, true);
        a((Runnable) new swe(this, eventParcel, str));
    }

    public final void a(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        iva.a((Object) userAttributeParcel);
        c(appMetadata);
        a((Runnable) new swg(this, userAttributeParcel, appMetadata));
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        iva.a((Object) runnable);
        if (this.a.F().c()) {
            runnable.run();
        } else {
            this.a.F().a(runnable);
        }
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        byte[] bArr;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        switch (i) {
            case 1:
                a((EventParcel) bhx.a(parcel3, EventParcel.CREATOR), (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((UserAttributeParcel) bhx.a(parcel3, UserAttributeParcel.CREATOR), (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a((AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((EventParcel) bhx.a(parcel3, EventParcel.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                AppMetadata appMetadata = (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR);
                c(appMetadata);
                a((Runnable) new swc(this, appMetadata));
                parcel2.writeNoException();
                break;
            case 7:
                AppMetadata appMetadata2 = (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR);
                boolean a2 = bhx.a(parcel);
                c(appMetadata2);
                try {
                    List<szi> list = (List) this.a.F().a((Callable) new swh(this, appMetadata2)).get();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (szi szi : list) {
                        if (!a2) {
                            if (szj.f(szi.c)) {
                            }
                        }
                        arrayList2.add(new UserAttributeParcel(szi));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException | ExecutionException e) {
                    if (!ayjn.b() || !this.a.d().b(appMetadata2.a, sud.aJ)) {
                        this.a.E().c.a("Failed to get user attributes. appId", sut.a(appMetadata2.a), e);
                        arrayList = null;
                    } else {
                        this.a.E().c.a("Failed to get user properties. appId", sut.a(appMetadata2.a), e);
                        arrayList = null;
                    }
                }
                parcel2.writeNoException();
                parcel4.writeTypedList(arrayList);
                break;
            case 9:
                EventParcel eventParcel = (EventParcel) bhx.a(parcel3, EventParcel.CREATOR);
                String readString = parcel.readString();
                iva.c(readString);
                iva.a((Object) eventParcel);
                a(readString, true);
                this.a.E().j.a("Log and bundle. event", this.a.m().a(eventParcel.a));
                long c2 = this.a.o().c() / 1000000;
                svs F = this.a.F();
                swf swf = new swf(this, eventParcel, readString);
                F.k();
                iva.a((Object) swf);
                svq svq = new svq(F, swf, true, "Task exception on worker thread");
                if (Thread.currentThread() == F.a) {
                    svq.run();
                } else {
                    F.a(svq);
                }
                try {
                    byte[] bArr2 = (byte[]) svq.get();
                    if (bArr2 == null) {
                        this.a.E().c.a("Log and bundle returned null. appId", sut.a(readString));
                        bArr2 = new byte[0];
                    }
                    this.a.E().j.a("Log and bundle processed. event, size, time_ms", this.a.m().a(eventParcel.a), Integer.valueOf(bArr2.length), Long.valueOf((this.a.o().c() / 1000000) - c2));
                    bArr = bArr2;
                } catch (InterruptedException | ExecutionException e2) {
                    this.a.E().c.a("Failed to log and bundle. appId, event, error", sut.a(readString), this.a.m().a(eventParcel.a), e2);
                    bArr = null;
                }
                parcel2.writeNoException();
                parcel4.writeByteArray(bArr);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String b2 = b((AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeString(b2);
                break;
            case 12:
                a((ConditionalUserPropertyParcel) bhx.a(parcel3, ConditionalUserPropertyParcel.CREATOR), (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a((ConditionalUserPropertyParcel) bhx.a(parcel3, ConditionalUserPropertyParcel.CREATOR));
                parcel2.writeNoException();
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                List a3 = a(parcel.readString(), parcel.readString(), bhx.a(parcel), (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeTypedList(a3);
                break;
            case Service.START_CONTINUATION_MASK:
                List a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), bhx.a(parcel));
                parcel2.writeNoException();
                parcel4.writeTypedList(a4);
                break;
            case 16:
                List a5 = a(parcel.readString(), parcel.readString(), (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel4.writeTypedList(a5);
                break;
            case 17:
                List a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel4.writeTypedList(a6);
                break;
            case 18:
                AppMetadata appMetadata3 = (AppMetadata) bhx.a(parcel3, AppMetadata.CREATOR);
                a(appMetadata3.a, false);
                a((Runnable) new swb(this, appMetadata3));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
