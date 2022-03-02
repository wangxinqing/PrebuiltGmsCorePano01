package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: aeht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeht extends bhw implements aehu {
    private final Context a;
    private tue b;

    public aeht() {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
    }

    public final void a(Event event) {
        jjg jjg = tsp.a;
        tue tue = this.b;
        if (tue != null) {
            tue.a(event);
        } else {
            ((anih) tsp.a.c()).a("FastPair: Did not initialize logger.");
        }
    }

    public final void b(Event event) {
        jjg jjg = tsp.a;
        tue tue = this.b;
        if (tue != null) {
            tue.a(event, event.e());
        } else {
            ((anih) tsp.a.c()).a("FastPair: Did not initialize logger.");
        }
    }

    public aeht(Context context) {
        super("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
        this.a = context;
    }

    public final void a(String str, String str2) {
        jjg jjg = tsp.a;
        this.b = new tue(new ttu(str, str2, this.a));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readString(), parcel.readString());
        } else if (i == 2) {
            a((Event) bhx.a(parcel, Event.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            b((Event) bhx.a(parcel, Event.CREATOR));
        }
        return true;
    }
}
