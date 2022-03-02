package defpackage;

import android.os.Parcel;
import com.google.android.gms.mdns.MdnsServiceInfo;

/* renamed from: sob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sob extends bhw implements soc {
    private final ige a;

    public sob() {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
    }

    public sob(ige ige) {
        super("com.google.android.gms.mdns.internal.IMdnsServiceBrowserListener");
        this.a = ige;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                this.a.a(new sod((MdnsServiceInfo) bhx.a(parcel, MdnsServiceInfo.CREATOR)));
                return true;
            case 2:
                this.a.a(new soe((MdnsServiceInfo) bhx.a(parcel, MdnsServiceInfo.CREATOR)));
                return true;
            case 3:
                this.a.a(new sof(parcel.readString()));
                return true;
            case 4:
                this.a.a(new sog(parcel.readInt()));
                return true;
            case 5:
                this.a.a(new soh());
                return true;
            case 6:
                parcel.createStringArrayList();
                parcel.readInt();
                this.a.a(new soi());
                return true;
            case 7:
                this.a.a(new soj(parcel.readInt(), parcel.readInt()));
                return true;
            default:
                return false;
        }
    }
}
