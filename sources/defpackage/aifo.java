package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationAvailability;
import java.util.List;

/* renamed from: aifo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifo implements aifr, aiew {
    public final aiex a;
    public final aifn b;
    public boolean c = false;
    public boolean d = false;
    public Location e = null;
    public aiew f;
    private final aifs g;

    public aifo(aiex aiex, aifs aifs) {
        this.a = aiex;
        this.g = aifs;
        aiex.a((aiew) this);
        this.b = new aifn(this);
    }

    public final void a(LocationAvailability locationAvailability) {
        aiew aiew;
        if (this.c && !this.d && (aiew = this.f) != null) {
            aiew.a(locationAvailability);
        }
    }

    public final void e() {
        a(false);
    }

    public final void a(boolean z) {
        if (z != this.d) {
            this.d = z;
            this.e = null;
            if (!z) {
                aifs aifs = this.g;
                synchronized (aifs.d) {
                    if (aifs.e != null) {
                        aifs.e = null;
                        if (!jkr.b()) {
                            aifs.a.getContentResolver().unregisterContentObserver(aifs.b);
                        } else {
                            aifs.c.a((jhq) aifs);
                        }
                    }
                }
                if (this.c) {
                    this.a.a();
                    return;
                }
                return;
            }
            this.g.a(this);
            this.a.b();
        }
    }

    public final void e(List list) {
        aiew aiew;
        if (this.c && !this.d && (aiew = this.f) != null) {
            aiew.e(list);
        }
    }
}
