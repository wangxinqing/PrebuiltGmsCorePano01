package defpackage;

import android.os.AsyncTask;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.gms.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pua extends AsyncTask {
    final /* synthetic */ pub a;
    private final ptv b;
    private final View c;

    public pua(pub pub, View view, ptv ptv) {
        this.a = pub;
        this.b = ptv;
        this.c = view;
    }

    /* access modifiers changed from: protected */
    public final Integer a() {
        aajk a2 = aafi.a(this.a.a);
        ptv ptv = this.b;
        String str = ptv.k;
        boolean z = ptv.i;
        iha b2 = ihb.b();
        b2.a = new aakb(str, !z);
        try {
            acws.a(((iby) a2).a(b2.a()), 5, TimeUnit.SECONDS);
            return 0;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e.getCause() instanceof ibr) {
                return Integer.valueOf(((ibr) e.getCause()).a());
            }
            return 8;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (this.a.b && num.intValue() == 0) {
            ((CompoundButton) this.c.findViewById(R.id.toggle)).toggle();
            this.b.toggle();
        }
    }
}
