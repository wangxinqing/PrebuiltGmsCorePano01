package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* renamed from: alhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhz extends rq {
    private final Rect f = new Rect();
    private final TextView g;

    public alhz(TextView textView) {
        super(textView);
        this.g = textView;
    }

    private final CharSequence a(ClickableSpan clickableSpan) {
        CharSequence text = this.g.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    private final ClickableSpan e(int i) {
        CharSequence text = this.g.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int a(float f2, float f3) {
        CharSequence text = this.g.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.g;
        int i = -1;
        if (textView.getLayout() != null) {
            i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f3 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan e = e(i);
        if (e != null) {
            accessibilityEvent.setContentDescription(a(e));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.g.getText());
    }

    /* access modifiers changed from: protected */
    public final void a(int i, qs qsVar) {
        Layout layout;
        ClickableSpan e = e(i);
        if (e != null) {
            qsVar.d(a(e));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            qsVar.d(this.g.getText());
        }
        qsVar.k();
        qsVar.c(true);
        Rect rect = this.f;
        CharSequence text = this.g.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.g.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(e);
            int spanEnd = spanned.getSpanEnd(e);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(this.g.getTotalPaddingLeft(), this.g.getTotalPaddingTop());
        }
        if (this.f.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.f.set(0, 0, 1, 1);
        }
        qsVar.b(this.f);
        qsVar.a(16);
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        CharSequence text = this.g.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan spanStart : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
            }
        }
    }

    public final boolean a(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan e = e(i);
        if (e != null) {
            e.onClick(this.g);
            return true;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        return false;
    }
}
