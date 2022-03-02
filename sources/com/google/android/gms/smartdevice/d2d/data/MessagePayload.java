package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessagePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new abwd();
    private static final HashMap o;
    public final Set a;
    public final int b;
    public int c;
    public BootstrapOptions d;
    public BootstrapConfigurations e;
    public DisplayText f;
    public AccountBootstrapPayload g;
    public ProgressEvent h;
    public boolean i;
    public ArrayList j;
    public AccountTransferPayload k;
    public DeviceStatus l;
    public WorkProfilePayload m;
    public ArrayList n;
    private int p;
    private boolean q;
    private boolean r;

    static {
        HashMap hashMap = new HashMap();
        o = hashMap;
        hashMap.put("protocolVersion", FastJsonResponse$Field.a("protocolVersion", 7));
        o.put("bootstrapState", FastJsonResponse$Field.a("bootstrapState", 2));
        o.put("bootstrapOptions", FastJsonResponse$Field.a("bootstrapOptions", 3, BootstrapOptions.class));
        o.put("bootstrapConfigurations", FastJsonResponse$Field.a("bootstrapConfigurations", 4, BootstrapConfigurations.class));
        o.put("displayText", FastJsonResponse$Field.a("displayText", 5, DisplayText.class));
        o.put("accountBootstrapPayload", FastJsonResponse$Field.a("accountBootstrapPayload", 6, AccountBootstrapPayload.class));
        o.put("progressEvent", FastJsonResponse$Field.a("progressEvent", 8, ProgressEvent.class));
        o.put("priorityMessage", FastJsonResponse$Field.e("priorityMessage", 9));
        o.put("accountTransferResults", FastJsonResponse$Field.b("accountTransferResults", 10, AccountTransferResult.class));
        o.put("accountTransferMsg", FastJsonResponse$Field.a("accountTransferMsg", 11, AccountTransferPayload.class));
        o.put("deviceStatus", FastJsonResponse$Field.a("deviceStatus", 12, DeviceStatus.class));
        o.put("workProfilePayload", FastJsonResponse$Field.a("workProfilePayload", 13, WorkProfilePayload.class));
        o.put("esimActivationPayloads", FastJsonResponse$Field.b("esimActivationPayloads", 14, EsimActivationPayload.class));
    }

    public MessagePayload() {
        this.c = 0;
        this.q = false;
        this.r = false;
        this.b = 3;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.p = 3;
        hashSet.add(7);
    }

    public final /* bridge */ /* synthetic */ Map a() {
        return o;
    }

    public final int b() {
        if (!this.q || this.r) {
            return this.p;
        }
        return 0;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessagePayload[bootstrapState=");
        sb.append(this.c);
        if (this.d != null) {
            sb.append(" bootstrapOptions=ELIDED");
        }
        if (this.e != null) {
            sb.append(" bootstrapConfigurations=ELIDED");
        }
        if (this.f != null) {
            sb.append(" displayText=\"");
            sb.append(this.f);
            sb.append("\"");
        }
        if (this.g != null) {
            sb.append(" accountBootstrapPayload=ELIDED");
        }
        if (this.h != null) {
            sb.append(" progressEvent=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" accountTransferPayload=ELIDED");
        }
        if (this.j != null) {
            sb.append(" accountTransferResults=ELIDED");
        }
        if (this.l != null) {
            sb.append(" deviceStatus=");
            sb.append(this.l);
        }
        if (this.m != null) {
            sb.append(" workProfilePayload=ELIDED");
        }
        if (this.n != null) {
            sb.append(" esimActivationPayloads=ELIDED");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void e(String str) {
        this.f = new DisplayText(str);
        this.a.add(5);
    }

    public final void a(int i2) {
        this.c = i2;
        this.a.add(2);
    }

    /* access modifiers changed from: protected */
    public final Object b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 1:
                return Integer.valueOf(this.b);
            case 2:
                return Integer.valueOf(this.c);
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return this.f;
            case 6:
                return this.g;
            case 7:
                return Integer.valueOf(b());
            case 8:
                return this.h;
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return this.j;
            case 11:
                return this.k;
            case 12:
                return this.l;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return this.m;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return this.n;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            ivx.b(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            ivx.b(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            ivx.a(parcel, 3, this.d, i2, true);
        }
        if (set.contains(4)) {
            ivx.a(parcel, 4, this.e, i2, true);
        }
        if (set.contains(5)) {
            ivx.a(parcel, 5, this.f, i2, true);
        }
        if (set.contains(6)) {
            ivx.a(parcel, 6, this.g, i2, true);
        }
        if (set.contains(7)) {
            ivx.b(parcel, 7, b());
        }
        if (set.contains(8)) {
            ivx.a(parcel, 8, this.h, i2, true);
        }
        if (set.contains(9)) {
            ivx.a(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            ivx.c(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            ivx.a(parcel, 11, this.k, i2, true);
        }
        if (set.contains(12)) {
            ivx.a(parcel, 12, this.l, i2, true);
        }
        if (set.contains(13)) {
            ivx.a(parcel, 13, this.m, i2, true);
        }
        if (set.contains(14)) {
            ivx.c(parcel, 14, this.n, true);
        }
        ivx.b(parcel, a2);
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        this.q = true;
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.c = i2;
        } else if (i3 == 7) {
            this.p = i2;
            this.r = true;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i3);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a.add(Integer.valueOf(i3));
    }

    public MessagePayload(Set set, int i2, int i3, int i4, BootstrapOptions bootstrapOptions, BootstrapConfigurations bootstrapConfigurations, DisplayText displayText, AccountBootstrapPayload accountBootstrapPayload, ProgressEvent progressEvent, boolean z, ArrayList arrayList, AccountTransferPayload accountTransferPayload, DeviceStatus deviceStatus, WorkProfilePayload workProfilePayload, ArrayList arrayList2) {
        this.q = false;
        this.r = false;
        this.a = set;
        this.b = i2;
        this.p = i3;
        this.c = i4;
        this.d = bootstrapOptions;
        this.e = bootstrapConfigurations;
        this.f = displayText;
        this.g = accountBootstrapPayload;
        this.h = progressEvent;
        this.i = z;
        this.j = arrayList;
        this.k = accountTransferPayload;
        this.l = deviceStatus;
        this.m = workProfilePayload;
        this.n = arrayList2;
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, jag jag) {
        this.q = true;
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 3:
                this.d = (BootstrapOptions) jag;
                break;
            case 4:
                this.e = (BootstrapConfigurations) jag;
                break;
            case 5:
                this.f = (DisplayText) jag;
                break;
            case 6:
                this.g = (AccountBootstrapPayload) jag;
                break;
            case 8:
                this.h = (ProgressEvent) jag;
                break;
            case 11:
                this.k = (AccountTransferPayload) jag;
                break;
            case 12:
                this.l = (DeviceStatus) jag;
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                this.m = (WorkProfilePayload) jag;
                break;
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), jag.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    public final void b(ArrayList arrayList) {
        this.n = arrayList;
        this.a.add(14);
    }

    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 10) {
            this.j = arrayList;
        } else if (i2 == 14) {
            this.n = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(i2), arrayList.getClass().getCanonicalName()}));
        }
        this.a.add(Integer.valueOf(i2));
    }

    /* access modifiers changed from: protected */
    public final void a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 9) {
            this.i = z;
            this.a.add(Integer.valueOf(i2));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i2);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(BootstrapConfigurations bootstrapConfigurations) {
        this.e = bootstrapConfigurations;
        this.a.add(4);
    }

    public final void a(BootstrapOptions bootstrapOptions) {
        this.d = bootstrapOptions;
        this.a.add(3);
    }

    public final void a(AccountBootstrapPayload accountBootstrapPayload) {
        this.g = accountBootstrapPayload;
        this.a.add(6);
    }

    public final void a(AccountTransferPayload accountTransferPayload) {
        this.k = accountTransferPayload;
        this.a.add(11);
    }

    public final void a(DeviceStatus deviceStatus) {
        this.l = deviceStatus;
        this.a.add(12);
    }

    public final void a(WorkProfilePayload workProfilePayload) {
        this.m = workProfilePayload;
        this.a.add(13);
    }

    public final void a(ArrayList arrayList) {
        this.j = arrayList;
        this.a.add(10);
    }

    /* access modifiers changed from: protected */
    public final boolean a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }
}
