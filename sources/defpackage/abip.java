package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.R;

/* renamed from: abip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abip extends abjz {
    private final boolean b;

    public abip(Context context, int i, boolean z) {
        super(context, i, 0, (Drawable) null);
        this.b = z;
        int paddingLeft = this.c.findViewById(R.id.title).getPaddingLeft();
        this.c.findViewById(R.id.title).setPadding(paddingLeft, 0, paddingLeft, context.getResources().getDimensionPixelSize(R.dimen.card_entry_text_padding));
    }

    public final void a() {
        this.c.setVisibility(0);
        super.a();
    }

    public final void b() {
        if (!this.b) {
            this.c.setVisibility(8);
        } else if (c()) {
            super.b();
        }
    }
}
