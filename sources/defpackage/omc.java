package defpackage;

import android.view.View;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;

/* renamed from: omc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class omc implements View.OnClickListener {
    private final PopularArticlesContainer a;

    public omc(PopularArticlesContainer popularArticlesContainer) {
        this.a = popularArticlesContainer;
    }

    public void onClick(View view) {
        PopularArticlesContainer popularArticlesContainer = this.a;
        popularArticlesContainer.a.m();
        PopularArticlesContainer.a(popularArticlesContainer.a, 30, popularArticlesContainer.c.e, "");
        ooe.a(popularArticlesContainer.a, popularArticlesContainer.c, 30, 0);
    }
}
