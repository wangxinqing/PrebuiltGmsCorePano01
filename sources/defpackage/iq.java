package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: iq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class iq extends gj {
    ListAdapter a;
    ListView b;
    View c;
    TextView d;
    View e;
    View f;
    CharSequence g;
    boolean h;
    private final Handler i = new Handler();
    private final Runnable j = new io(this);
    private final AdapterView.OnItemClickListener k = new ip(this);

    private final void a(boolean z, boolean z2) {
        j();
        View view = this.e;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.h != z) {
            this.h = z;
            if (!z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                    this.f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                } else {
                    view.clearAnimation();
                    this.f.clearAnimation();
                }
                this.e.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                this.f.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f.clearAnimation();
            }
            this.e.setVisibility(8);
            this.f.setVisibility(0);
        }
    }

    private final void j() {
        if (this.b == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.b = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.d = textView;
                    if (textView == null) {
                        this.c = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.e = view.findViewById(16711682);
                    this.f = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.b = listView;
                        View view2 = this.c;
                        if (view2 == null) {
                            CharSequence charSequence = this.g;
                            if (charSequence != null) {
                                this.d.setText(charSequence);
                                this.b.setEmptyView(this.d);
                            }
                        } else {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.h = true;
                this.b.setOnItemClickListener(this.k);
                ListAdapter listAdapter = this.a;
                if (listAdapter != null) {
                    this.a = null;
                    setListAdapter(listAdapter);
                } else if (this.e != null) {
                    a(false, false);
                }
                this.i.post(this.j);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public ListAdapter getListAdapter() {
        return this.a;
    }

    public ListView getListView() {
        j();
        return this.b;
    }

    public long getSelectedItemId() {
        j();
        return this.b.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        j();
        return this.b.getSelectedItemPosition();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.i.removeCallbacks(this.j);
        this.b = null;
        this.h = false;
        this.f = null;
        this.e = null;
        this.c = null;
        this.d = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listView, View view, int i2, long j2) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        j();
    }

    public void setEmptyText(CharSequence charSequence) {
        j();
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.g == null) {
                this.b.setEmptyView(this.d);
            }
            this.g = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.a;
        this.a = listAdapter;
        ListView listView = this.b;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.h && listAdapter2 == null) {
                a(true, requireView().getWindowToken() != null);
            }
        }
    }

    public void setListShown(boolean z) {
        a(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        a(z, false);
    }

    public void setSelection(int i2) {
        j();
        this.b.setSelection(i2);
    }
}
