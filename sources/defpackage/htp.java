package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: htp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class htp extends nis {
    private final hsx a;
    private final String b;
    private final hvh c;
    private final String d;

    public htp(hsx hsx, String str, hvh hvh, String str2) {
        super(40, "GetLogEventParcelablesOperation");
        this.a = hsx;
        this.b = str;
        this.c = hvh;
        this.d = str2;
    }

    public final void a(Context context) {
        if (ClearcutLoggerChimeraService.a(this.d)) {
            ArrayList arrayList = new ArrayList();
            anhk i = this.c.b().listIterator();
            while (i.hasNext()) {
                try {
                    arrayList.addAll(((hvg) i.next()).c(this.b));
                } catch (SQLiteException | IOException e) {
                    String valueOf = String.valueOf(this.b);
                    Log.e("GetLogEventParcelablesOperation", valueOf.length() == 0 ? new String("Unable to query log events for log source ") : "Unable to query log events for log source ".concat(valueOf), e);
                    String valueOf2 = String.valueOf(this.b);
                    throw new nja(31005, valueOf2.length() == 0 ? new String("Unable to query log events for log source ") : "Unable to query log events for log source ".concat(valueOf2));
                }
            }
            ilm d2 = ilk.d();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ilk.a(d2, (LogEventParcelable) arrayList.get(i2));
            }
            DataHolder a2 = d2.a(0);
            try {
                this.a.a(a2);
                a2.close();
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new nja(31001, "Debug operation disallowed");
        }
        throw th;
    }

    public final void a(Status status) {
        DataHolder b2 = DataHolder.b(status.i);
        try {
            this.a.a(b2);
            if (b2 != null) {
                b2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
