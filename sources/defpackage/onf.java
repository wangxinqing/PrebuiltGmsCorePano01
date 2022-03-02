package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.List;

/* renamed from: onf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onf {
    public final HelpChimeraActivity a;
    public final oaf b;
    public RecyclerView c;
    public onl d;
    public onb e;
    public ListView f;
    public ohh g;

    public onf(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
        this.b = new oaf(helpChimeraActivity);
        if (b()) {
            RecyclerView recyclerView = (RecyclerView) helpChimeraActivity.findViewById(R.id.gh_search_results_list);
            this.c = recyclerView;
            recyclerView.setLayoutManager(new abk());
            this.d = new onl(helpChimeraActivity);
            this.e = new onb(helpChimeraActivity);
            return;
        }
        this.f = (ListView) helpChimeraActivity.findViewById(R.id.gh_search_results_list);
        ohh ohh = new ohh(helpChimeraActivity);
        this.g = ohh;
        this.f.setAdapter(ohh);
    }

    public final void a() {
        this.c.setAdapter(this.d);
        this.d.a((String) null, (List) null);
    }

    public final boolean b() {
        return this.a.x != null && ofq.a(axof.b()) && ofq.a(axor.b());
    }
}
