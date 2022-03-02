package defpackage;

import android.content.Intent;
import android.util.SparseArray;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;

/* renamed from: qan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qan {
    public final qam a;
    public final SparseArray b = new SparseArray();
    private final qao c;

    private qan(qao qao, qam qam) {
        this.c = qao;
        this.a = qam;
    }

    public static qan a(FragmentActivity fragmentActivity) {
        qao a2 = qao.a(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        qam qam = (qam) supportFragmentManager.findFragmentByTag("StartActivityForResultRetainedFragment");
        if (qam == null) {
            qam = new qam();
            qam.a = new qan(a2, qam);
            supportFragmentManager.beginTransaction().add((Fragment) qam, "StartActivityForResultRetainedFragment").commitNow();
        } else if (qam.a == null) {
            qam.a = new qan(a2, qam);
        }
        return qam.a;
    }

    public final qat a(int i, Intent intent) {
        return this.c.a(Integer.valueOf(i), new qak(this, i, intent));
    }
}
