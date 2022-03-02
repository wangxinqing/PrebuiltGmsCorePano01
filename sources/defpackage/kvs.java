package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;

/* renamed from: kvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kvs extends qvr {
    private final Context a;

    public kvs(Looper looper, Context context) {
        super(looper);
        this.a = context;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            kvt.a.b("EventCallback", "Don't know how to handle this event in context %s", this.a);
            return;
        }
        Pair pair = (Pair) message.obj;
        kss kss = (kss) pair.first;
        DriveEvent driveEvent = (DriveEvent) pair.second;
        int a2 = driveEvent.a();
        if (a2 == 1) {
            ChangeEvent changeEvent = (ChangeEvent) driveEvent;
            ((ksg) kss).a();
        } else if (a2 == 2) {
            CompletionEvent completionEvent = (CompletionEvent) driveEvent;
            ((ksq) kss).c();
        } else if (a2 == 3) {
            lou lou = (lou) kss;
            QueryResultEventParcelable queryResultEventParcelable = (QueryResultEventParcelable) driveEvent;
            DataHolder dataHolder = queryResultEventParcelable.b;
            if (dataHolder != null) {
                jzt jzt = new kvr(new jzt(dataHolder)).a;
                if (!lou.equals(lou.a.k)) {
                    jzt.c();
                } else {
                    lou.a.a(jzt, false);
                }
            }
            if (queryResultEventParcelable.c) {
                int i = queryResultEventParcelable.d;
                if (lou.equals(lou.a.k) && i == 1) {
                    low low = lou.a;
                    low.h = false;
                    lpl lpl = low.q;
                    if (lpl != null) {
                        lpl.a();
                    }
                }
            }
        } else if (a2 == 4) {
            ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) driveEvent;
            ((ksl) kss).b();
        } else if (a2 != 8) {
            kvt.a.b("Unexpected event: %s", driveEvent);
        } else {
            new kts(((TransferProgressEvent) driveEvent).a);
            ((ksy) kss).a();
        }
    }
}
