package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.pano.chimera.Action;
import com.google.android.pano.widget.ScrollAdapterView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akdr extends BaseAdapter implements View.OnKeyListener, View.OnClickListener, akge, akgs {
    private static Integer g = null;
    public final Context a;
    public final List b;
    public akdo c;
    public akdp d;
    public akdq e;
    public ScrollAdapterView f;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    private boolean n;
    private final int o;
    private View p = null;

    public akdr(Context context) {
        this.a = context;
        this.o = context.getResources().getInteger(R.integer.dialog_animation_duration);
        this.h = a((int) R.dimen.list_item_unselected_text_alpha);
        this.i = a((int) R.dimen.list_item_selected_title_text_alpha);
        this.j = a((int) R.dimen.list_item_disabled_title_text_alpha);
        this.k = a((int) R.dimen.list_item_selected_description_text_alpha);
        this.m = a((int) R.dimen.list_item_unselected_description_text_alpha);
        this.l = a((int) R.dimen.list_item_disabled_description_text_alpha);
        a((int) R.dimen.list_item_selected_chevron_background_alpha);
        a((int) R.dimen.list_item_disabled_chevron_background_alpha);
        this.b = new ArrayList();
        this.n = false;
    }

    private final float a(int i2) {
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(i2, typedValue, true);
        return typedValue.getFloat();
    }

    public final akgf a() {
        return null;
    }

    public final int getCount() {
        return this.b.size();
    }

    public final Object getItem(int i2) {
        return this.b.get(i2);
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        int i4;
        View a2 = a(viewGroup);
        Action action = (Action) this.b.get(i2);
        TextView textView = (TextView) a2.findViewById(R.id.action_title);
        textView.setVisibility(0);
        ((TextView) a2.findViewById(R.id.action_title_sectionheader)).setVisibility(8);
        TextView textView2 = (TextView) a2.findViewById(R.id.action_description);
        textView2.setText(action.c);
        if (!TextUtils.isEmpty(action.c)) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        textView.setText(action.b);
        ImageView imageView = (ImageView) a2.findViewById(R.id.action_checkmark);
        if (!action.h) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        imageView.setVisibility(i4);
        ImageView imageView2 = (ImageView) a2.findViewById(R.id.action_icon);
        Drawable a3 = action.a(this.a);
        if (a3 != null) {
            imageView2.setImageDrawable(a3);
            imageView2.setVisibility(0);
        } else {
            Uri uri = action.g;
            if (uri != null) {
                imageView2.setVisibility(4);
                akfj a4 = akfj.a(this.a);
                akfk akfk = new akfk(this.a);
                akfk.a = uri;
                akfk.a(imageView2.getLayoutParams().width);
                a4.a(akfk.a(), (akfh) new akdl(this, imageView2));
            } else {
                imageView2.setVisibility(8);
            }
        }
        ((ImageView) a2.findViewById(R.id.action_next_chevron)).setVisibility(8);
        a2.findViewById(R.id.action_next_chevron_background).setVisibility(4);
        ((LinearLayout) a2.findViewById(R.id.progressbar_layout)).setVisibility(8);
        ((ProgressBar) a2.findViewById(R.id.progressbar)).setVisibility(8);
        Resources resources = a2.getContext().getResources();
        if (action.i) {
            textView.setMaxLines(resources.getInteger(R.integer.action_title_max_lines));
            Context context = a2.getContext();
            if (g == null) {
                Resources resources2 = context.getResources();
                g = Integer.valueOf((int) ((((float) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight()) - resources2.getDimension(R.dimen.list_item_vertical_padding)) - ((float) (resources2.getInteger(R.integer.action_title_max_lines) * textView.getLineHeight()))));
            }
            textView2.setMaxHeight(g.intValue());
        } else {
            textView.setMaxLines(resources.getInteger(R.integer.action_title_min_lines));
            textView2.setMaxLines(resources.getInteger(R.integer.action_description_min_lines));
        }
        a2.setTag(R.id.action_title, action);
        a2.setOnKeyListener(this);
        a2.setOnClickListener(this);
        a(a2, false, false);
        return a2;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public void onClick(View view) {
        if (view != null && view.getWindowToken() != null && this.c != null) {
            this.c.a((Action) view.getTag(R.id.action_title));
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (view == null) {
            return false;
        }
        Action action = (Action) view.getTag(R.id.action_title);
        if (i2 != 23 && i2 != 66 && i2 != 160 && i2 != 99 && i2 != 100) {
            return false;
        }
        AudioManager audioManager = (AudioManager) view.getContext().getSystemService("audio");
        if (!action.k) {
            if (view.isSoundEffectsEnabled() && keyEvent.getAction() == 0) {
                audioManager.playSoundEffect(9);
            }
            return true;
        }
        int action2 = keyEvent.getAction();
        if (action2 != 0) {
            if (action2 != 1 || !this.n) {
                return false;
            }
            this.n = false;
            a(view, 0.2f, 1.0f, false);
            return true;
        } else if (this.n) {
            return false;
        } else {
            this.n = true;
            if (view.isSoundEffectsEnabled()) {
                audioManager.playSoundEffect(0);
            }
            a(view, 1.0f, 0.2f, this.n);
            return true;
        }
    }

    private final void a(View view, float f2, float f3, boolean z) {
        int i2;
        View view2;
        View view3 = view;
        boolean z2 = z;
        if (view.getWindowToken() != null) {
            Action action = (Action) view3.getTag(R.id.action_title);
            if (!z2 && (i2 = action.j) != 0) {
                int size = this.b.size();
                boolean z3 = false;
                int i3 = 0;
                while (i3 < size) {
                    Action action2 = (Action) this.b.get(i3);
                    if (action2 != action && action2.j == i2 && action2.h) {
                        action2.h = z3;
                        ScrollAdapterView scrollAdapterView = this.f;
                        if (scrollAdapterView != null) {
                            int d2 = scrollAdapterView.d(i3);
                            if (d2 < scrollAdapterView.k() || d2 >= scrollAdapterView.getChildCount()) {
                                view2 = null;
                            } else {
                                view2 = scrollAdapterView.getChildAt(d2);
                            }
                            if (view2 != null) {
                                View findViewById = view2.findViewById(R.id.action_checkmark);
                                findViewById.animate().alpha(0.0f).setDuration(100).setStartDelay(0);
                                findViewById.animate().setListener(new akdn(findViewById));
                            }
                        }
                    }
                    i3++;
                    z3 = false;
                }
                if (!action.h) {
                    action.h = true;
                    if (this.f != null) {
                        View findViewById2 = view3.findViewById(R.id.action_checkmark);
                        findViewById2.setVisibility(0);
                        findViewById2.setAlpha(0.0f);
                        findViewById2.animate().alpha(1.0f).setDuration(100).setStartDelay(0);
                        findViewById2.animate().setListener((Animator.AnimatorListener) null);
                    }
                }
            }
            view.setAlpha(f2);
            view3.setLayerType(2, (Paint) null);
            view.buildLayer();
            view.animate().alpha(f3).setDuration(100).setStartDelay(0);
            view.animate().setListener(new akdm(this, view3, z2, action));
            view.animate().start();
        }
    }

    private final void a(View view, boolean z, float f2) {
        if (z) {
            view.animate().alpha(f2).setDuration((long) this.o).setInterpolator(new DecelerateInterpolator(2.0f)).start();
        } else {
            view.setAlpha(f2);
        }
    }

    private final void a(View view, boolean z, boolean z2) {
        if (view != null) {
            boolean z3 = ((Action) view.getTag(R.id.action_title)).k;
            float f2 = !z3 ? this.j : !z ? this.h : this.i;
            float f3 = !z ? this.m : !z3 ? this.l : this.k;
            a((View) (TextView) view.findViewById(R.id.action_title), z2, f2);
            a((View) (TextView) view.findViewById(R.id.action_description), z2, f3);
            a((View) (ImageView) view.findViewById(R.id.action_checkmark), z2, f2);
            a((View) (ImageView) view.findViewById(R.id.action_icon), z2, f2);
            a(view.findViewById(R.id.action_next_chevron_background), z2, 0.0f);
            akdp akdp = this.d;
            if (akdp != null && z) {
                akdp.b((Action) view.getTag(R.id.action_title));
            }
        }
    }

    public final View a(ViewGroup viewGroup) {
        return LayoutInflater.from(this.a).inflate(R.layout.settings_list_item, viewGroup, false);
    }

    public final void a(View view, float f2) {
        if (((double) f2) != 0.0d) {
            View view2 = this.p;
            if (view2 != null) {
                a(view2, false, true);
                this.p = null;
            }
        } else if (view != null) {
            a(view, true, true);
            this.p = view;
        }
    }

    public final void a(Action action) {
        this.b.add(action);
        notifyDataSetChanged();
    }
}
