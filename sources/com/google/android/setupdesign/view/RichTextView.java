package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RichTextView extends AppCompatTextView implements alir {
    private alia b;

    public RichTextView(Context context) {
        super(context);
        b();
    }

    private final void b() {
        oz ozVar;
        if (Build.VERSION.SDK_INT >= 26) {
            ozVar = new oz();
        } else {
            ozVar = new alhz(this);
        }
        alia alia = new alia(ozVar);
        this.b = alia;
        qb.a((View) this, (oz) alia);
    }

    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        alia alia = this.b;
        if (alia != null) {
            oz ozVar = alia.b;
            if ((ozVar instanceof rq) && ((rq) ozVar).a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = Build.VERSION.SDK_INT;
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof aljs) {
            aljs aljs = (aljs) movementMethod;
            if (aljs.b == motionEvent) {
                return aljs.a;
            }
        }
        return onTouchEvent;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Cannot find resource: 0");
                        Log.w("RichTextView", sb.toString());
                    }
                    alit.a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    alit.a(spannableString, annotation, new alis(), new TypefaceSpan("sans-serif-medium"));
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned)) {
            z = false;
        } else if (((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new aljs());
        } else {
            setMovementMethod((MovementMethod) null);
        }
        setFocusable(z);
        if (Build.VERSION.SDK_INT >= 25) {
            setRevealOnFocusHint(false);
            setFocusableInTouchMode(z);
        }
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
