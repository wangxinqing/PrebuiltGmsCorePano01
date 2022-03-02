package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.google.android.gms.common.ui.LinkSpan;
import java.util.List;

/* renamed from: jgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jgg extends rq {
    private final TextView f;
    private final Rect g = new Rect();

    public jgg(TextView textView) {
        super(textView);
        this.f = textView;
    }

    private final CharSequence a(LinkSpan linkSpan) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(linkSpan), spanned.getSpanEnd(linkSpan));
    }

    private final LinkSpan e(int i) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        LinkSpan[] linkSpanArr = (LinkSpan[]) ((Spanned) text).getSpans(i, i, LinkSpan.class);
        if (linkSpanArr.length == 1) {
            return linkSpanArr[0];
        }
        return null;
    }

    private final void a(LinkSpan linkSpan, Rect rect) {
        CharSequence text = this.f.getText();
        rect.setEmpty();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(linkSpan);
            int spanEnd = spanned.getSpanEnd(linkSpan);
            Layout layout = this.f.getLayout();
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.left = (int) primaryHorizontal;
            if (lineForOffset2 == lineForOffset) {
                rect.right = (int) primaryHorizontal2;
            }
            rect.offset(this.f.getTotalPaddingLeft(), this.f.getTotalPaddingTop());
        }
    }

    /* access modifiers changed from: protected */
    public final int a(float f2, float f3) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        TextView textView = this.f;
        int i = -1;
        if (textView.getLayout() != null) {
            i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((float) ((textView.getHeight() - textView.getTotalPaddingBottom()) - 1), Math.max(0.0f, f3 - ((float) textView.getTotalPaddingTop()))) + ((float) textView.getScrollY()))), Math.min((float) ((textView.getWidth() - textView.getTotalPaddingRight()) - 1), Math.max(0.0f, f2 - ((float) textView.getTotalPaddingLeft()))) + ((float) textView.getScrollX()));
        }
        LinkSpan[] linkSpanArr = (LinkSpan[]) spanned.getSpans(i, i, LinkSpan.class);
        if (linkSpanArr.length == 1) {
            return spanned.getSpanStart(linkSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final void a(int i, AccessibilityEvent accessibilityEvent) {
        LinkSpan e = e(i);
        if (e != null) {
            accessibilityEvent.setContentDescription(a(e));
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        accessibilityEvent.setContentDescription(this.f.getText());
    }

    /* access modifiers changed from: protected */
    public final void a(int i, qs qsVar) {
        LinkSpan e = e(i);
        if (e != null) {
            qsVar.d(a(e));
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            qsVar.d(this.f.getText());
        }
        qsVar.k();
        qsVar.c(true);
        a(e, this.g);
        if (!this.g.isEmpty()) {
            Rect rect = this.g;
            a(e, rect);
            qsVar.b(rect);
        } else {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("LinkSpan bounds is empty for: ");
            sb2.append(i);
            Log.e("LinkAccessibilityHelper", sb2.toString());
            this.g.set(0, 0, 1, 1);
            qsVar.b(this.g);
        }
        qsVar.a(16);
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (LinkSpan spanStart : (LinkSpan[]) spanned.getSpans(0, spanned.length(), LinkSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
            }
        }
    }

    public final boolean a(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        LinkSpan e = e(i);
        if (e != null) {
            e.onClick(this.f);
            return true;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("LinkSpan is null for offset: ");
        sb.append(i);
        Log.e("LinkAccessibilityHelper", sb.toString());
        return false;
    }
}
