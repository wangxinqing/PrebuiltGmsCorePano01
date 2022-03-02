package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* renamed from: oji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oji extends ojp {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ ojk c;
    final /* synthetic */ mum d;

    public oji(Intent intent, WeakReference weakReference, ojk ojk, mum mum) {
        this.a = intent;
        this.b = weakReference;
        this.c = ojk;
        this.d = mum;
    }

    public final void a(GoogleHelp googleHelp) {
        ViewGroup viewGroup;
        long nanoTime = System.nanoTime();
        this.a.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            this.c.c(ojl.a);
            return;
        }
        if (this.d != null) {
            ojv ojv = new ojv(googleHelp);
            Context applicationContext = activity.getApplicationContext();
            mum mum = this.d;
            nyt nyt = new nyt(ojv.a);
            if (mum != null) {
                nyt.a.B = true;
                Context context = applicationContext;
                mum mum2 = mum;
                long j = nanoTime;
                ojv.a(new oja(context, ojv.a, mum2, j));
                ojv.a(new ojb(context, ojv.a, mum2, j));
            }
        }
        nyt nyt2 = new nyt(googleHelp);
        nyt2.a.z = hxj.b;
        if (nyt2.d() != null) {
            TogglingData d2 = nyt2.d();
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            d2.c = charSequence;
        }
        ojk ojk = this.c;
        Intent intent = this.a;
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            InProductHelp inProductHelp = (InProductHelp) ivy.a(intent, "EXTRA_IN_PRODUCT_HELP", InProductHelp.CREATOR);
            inProductHelp.a = googleHelp;
            ivy.a((SafeParcelable) inProductHelp, intent, "EXTRA_IN_PRODUCT_HELP");
        }
        activity.startActivityForResult(intent, 123);
        ojk.a((icl) Status.a);
    }
}
