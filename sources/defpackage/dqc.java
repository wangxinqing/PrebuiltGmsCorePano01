package defpackage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: dqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dqc implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ dqd a;

    public dqc(dqd dqd) {
        this.a = dqd;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        long j2;
        long j3;
        if (i != -1) {
            long longValue = jed.c(System.currentTimeMillis()).longValue();
            if (i == 1) {
                j3 = -604800000;
            } else if (i != 2) {
                j2 = longValue;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                this.a.b.setText(this.a.getString(R.string.common_network_usage_advanced_range_displayed, simpleDateFormat.format(new Date(j2)), simpleDateFormat.format(new Date(longValue))));
                dqd dqd = this.a;
                dqd.a.a = j2;
                dqd.a();
            } else {
                j3 = -2592000000L;
            }
            j2 = j3 + longValue;
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            this.a.b.setText(this.a.getString(R.string.common_network_usage_advanced_range_displayed, simpleDateFormat2.format(new Date(j2)), simpleDateFormat2.format(new Date(longValue))));
            dqd dqd2 = this.a;
            dqd2.a.a = j2;
            dqd2.a();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
