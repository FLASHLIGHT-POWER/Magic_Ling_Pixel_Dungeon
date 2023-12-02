package com.shatteredpixel.shatteredpixeldungeon.ui.changelist.mlpd;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroClass;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.scenes.PixelScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CrivusFruitsSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM300AttackSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DM720Sprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DiedMonkLoaderSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.DragonGirlBlueSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.FlowerSlimeSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.HeroSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.IceSlowGirlSprites;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MolotovHuntsmanSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedDragonSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.RedNecromancerSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.YogSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeButton;
import com.shatteredpixel.shatteredpixeldungeon.ui.changelist.ChangeInfo;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class vM0_6_6_Changes {

    public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
        add_CS_Changes(changeInfos);
        add_v0_6_8_0_Changes(changeInfos);
        add_v0_6_7_0_Changes(changeInfos);
        add_v0_6_6_0_Changes(changeInfos);
    }

    public static void add_CS_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("Coming Soon", true, "");
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes = new ChangeInfo("计划", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new RedNecromancerSprite(), ("BossRush2.0"),
                ("地牢发生了翻天覆地的改变，一切的矛头指向了死灵军团……")));

        changes.addButton(new ChangeButton(new Image(Assets.Interfaces.HAICONS, 16, 16, 16, 16), ("黄金时代改动预告"),
                ("黄金沉入黄沙，化为金水流入地下。\n" +
                        "黑暗的地牢就此发出了金色的光芒。\n" +
                        "树影融入黑夜，\n" +
                        "财富在此长眠，\n" +
                        "流沙，黄金与鲜血交织着，\n" +
                        "正如一首金色的华尔兹。\n" +
                        "冒险家，地牢与财富正在等着你。\n" +
                        "当然，你的舞伴可并不友好......\n" +
                        "黄金时代即将重做。\n" +
                        "策划by QinYue 不接入游戏主线剧情")));

        Image i = new Image("sprites/boss/fireDragon.png", 0, 0, 24, 24);
        i.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(i, ("熔岩火龙"),
                ("丛林暴乱的真相")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHALLANEESICON_14), ("寒冷系统V3.0"),
                ("寒冷系统将会彻底实装，敬请期待冬季版本")));

        changes = new ChangeInfo("改进", false, null);
        changes.hardlight(Window.CBLACK);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new CrivusFruitsSprite(), ("克里弗斯之果重做"),
                ("作为MLPD替代Goo的Boss,它还有很长的路要走。")));


        Image s = new DM300AttackSprite();
        s.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(s, ("DM-ZERO"),
                ("时间在这里停止流动，与DMZERO正面对决的即将到来")));

        Image c = new IceSlowGirlSprites();
        c.scale.set(PixelScene.align(0.74f));
        changes.addButton(new ChangeButton(c, ("冰雪魔女重做"),
                ("石碑上记录了有关于她的一切，她的过去，她的现在，她的未来。而当你与她对峙时，你是否能够看清她的真实面目？")));
    }

    public static void add_v0_6_8_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.8.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("武技实装第一轮"),
                ("部分武器武技已经实装，欢迎尝鲜")));

        changes.addButton(new ChangeButton(new DragonGirlBlueSprite(), ("远古遗迹强势归来"),
                ("远古遗迹重大更新，新增3个怪物，3+1个徽章，还有更多惊喜，欢迎前来体验。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RANDOM_CHEST), ("随机宝箱"),
                ("现在0层十字架和刻笔换成随机宝箱，你究竟是欧皇还是酋长，快来抽抽看吧。")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.MAGE, 7), ("英雄调整"),
                ("人物从初始自带一瓶冶疗改为\n\n" +
                        "1.战士初始为冶疗药剂\n" +
                        "2.法师初始为液火药剂\n" +
                        "3.女猎为灵视药剂\n" +
                        "4.盗贼为隐身药剂\n" +
                        "5.武斗为镜像卷轴")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_ROSE3), ("0层调整"),
                ("神器初始不再给予，改为牛皮书袋。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WHIP), ("冰澪匕首"),
                ("以前的冰霜长鞭改为冰澪匕首，伤害不变。武技视觉效果优化。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MAGIC_TORCH), ("魔法火把"),
                ("武技视觉效果优化和完善武技")));



        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("杂项改动"),
                ("1.部分素材优化迭代\n" +
                        "2.部分无用音乐删除\n" +
                        "3.少量Bug修复\n" +
                        "4.部分小细节优化更新")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "修复了以下Bug:\n\n" +
                        "1.修复了女猎解锁异常问题\n" +
                        "2.修复矮人国王相关问题\n" +
                        "3.修复了暴力Boss的额外拳头血量异常\n" +
                        "4.修复了部分文案缺失问题\n" +
                        "5.修复了盗贼血影蝙蝠血量异常问题"
        ));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAR_HAMMER), ("白檩剑"),
                ("以前的白金真银战锤大剑改为白檩剑，精准度提高，其余不变")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DG2), ("蛮人战斧"),
                ("武技视觉效果优化和完善武技，自身属性加强")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.YELLOWBOOKS), ("传说书籍"),
                ("现在如果存在英雄精英效果的状态下，不能继续阅读其他传说书籍。同时传说书籍在商人售卖处价格上涨。奈亚子终端仍然是720金币。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.DG3), ("钥匙剑"),
                ("钥匙剑现在只能通过钥匙升级，且获得途径仅在常规商人处有概率出现，且商人处可能有等级，但价钱也会上涨")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("灯火前路3.3"),
                ("以下Buff被削弱：\n\n" +
                        "1.前路现在在极度饥饿失去效果\n" +
                        "2.共生仅在一区有概率出现\n" +
                        "3.富饶从三折改为六折\n" +
                        "4.守护护盾刷新回合从150改为270")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("基因突变"),
                ("移除酸液体")));

    }

    public static void add_v0_6_7_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.7.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("艾诺琳娜"),
                ("现已修复决斗家的相关问题，部分武技后续实装，敬请期待")));

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("杂项改动"),
                ("1.部分素材优化迭代\n" +
                        "2.部分无用音乐删除\n" +
                        "3.少量Bug修复\n" +
                        "4.部分小细节优化更新")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY), ("UI优化"),
                ("部分页面的UI已经进行了优化，带给玩家更好的游戏体验")));

        changes.addButton(new ChangeButton(Icons.get(Icons.DISPLAY_PORT), ("快捷键优化"),
                ("PC键位有一点问题，已进行优化处理")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.MASTERY), ("新手引导&更多指南"),
                ("1.现在如果是第一次打开魔绫，将会有新手引导\n" +
                        "2.添加了更多引导指南，欢迎探索")));


        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new DiedMonkLoaderSprite(), ("矮人将军重做"),
                ("矮人将军纳入重做范围，敬请期待后续更新。")));

        changes.addButton(new ChangeButton(new FlowerSlimeSprites(), ("繁花史莱姆"),
                ("为了确保玩家能更好的在前期发展，繁花史莱姆面板进行了优化。具体如下：\n\n" +
                        "血量：12--->随机5到9\n" +
                        "伤害：2-5--->1-5\n" +
                        "种子掉率:5%-->9%")));

        changes.addButton(new ChangeButton(new CrivusFruitsSprite(), ("克里弗斯之果"),
                ("二阶段触手玩家攻击后，保底拥有4回合的回复回合")));

    }

    public static void add_v0_6_6_0_Changes( ArrayList<ChangeInfo> changeInfos ) {
        ChangeInfo changes = new ChangeInfo("v0.6.6.0", true, "");
        changes.hardlight(Window.TITLE_COLOR);
        changeInfos.add(changes);

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
        changes.hardlight(Window.GREEN_COLOR);
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), ("杂项改动"),
                ("种子方面改动如下：\n" +
                        "1.种子存档会显示绿色存档提示玩家\n" +
                        "2.种子可以在存档信息界面直接看见\n" +
                        "3.种子局最终结算总分减半\n" +
                        "4.种子局排行榜的样子有所不同\n" +
                        "\n其他方面：\n" +
                        "1.武器/法杖重命名功能回归\n" +
                        "2.迭代优化了一些素材\n" +
                        "3.底层代码优化")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.FIREDIED, true), ("水晶意志"),
                ("魔绫的返程之旅，准备好接受考验了吗？")));

        changes.addButton(new ChangeButton(Icons.get(Icons.CHANGES), ("重大更新"),
                ("魔绫现已更新底层到破碎V2.2.1版本!" +
                        "鸣谢：\n\n" +
                        "-首席内部测试：bzmdr\n" +
                        "-素材迭代优化：Danicel\n\n" +
                        "以及MLPD的开发团队的所有人员和广大玩家,\n" +
                        "两年以来，MLPD感谢有你")));

        changes.addButton(new ChangeButton(HeroSprite.avatar(HeroClass.DUELIST, 7), ("新英雄：艾诺琳娜"),
                ("破碎版本的决斗家，现已正式纳入MLPD。")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
        changes.hardlight( CharSprite.POSITIVE );
        changeInfos.add(changes);

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARTIFACT_CHALICE3), ("蓄血圣杯"),
                ("同步回1.2.3的圣杯形式")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.ARMOR, true), ("灯火前路-守护"),
                ("现在护盾不会自然衰减，且只要护盾不消失，可以缓慢回复护盾。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GAUNTLETS), ("碧灰双刃"),
                ("伤害提升，并且升为四阶武器")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_AIKELAIER), ("闪电花"),
                ("用该物品制作的无味果改名为雷暴果，拥有闪电链式反应效果。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_HTR), ("风暴雷霆法杖"),
                ("使用法杖在水中攻击时，有10%的概率获得3次的闪电链式反应效果")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("鬼磷精英"),
                ("现在死亡时会释放磷火。")));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
        changes.hardlight( CharSprite.NEGATIVE );
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.LIGHT_DIED, true), ("闪电链式反应"),
                ("现在必须在可见范围内才能攻击敌人，" +
                        "伤害小幅提升，并且调整为闪电链不自然衰减。")));

        changes.addButton( new ChangeButton(new BuffIcon(BuffIndicator.CORRUPT, true), ("精英挑战优化调整"),
                        "_-_A.精英强敌\n\n" +
                        "1.烈焰精英：不会在含有的水的地块上面死亡产生火焰\n\n" +
                        "2.索敌精英：现在不再是无限格子，而是4格\n\n" +
                        "3.鬼磷精英：现在攻击敌人不再必定追加磷火效果，调整为10%的概率，但死亡时无论有没有水都能引燃以自身为3x3的半径的鬼磷火焰。",
                        "_-_B.基因突变\n\n" +
                        "1.突变酸液体：现在生成概率5%，且每大层最多累计出现3个，在击败关键Boss后计算清铃。并且酸液有限，消耗完酸液后，变为常规攻击。\n\n" +
                        "2.新的突变体：\n\n" +
                        "突变相位体：这种突变体在前面4次攻击命中敌人后会随机传送，并且不处于你视野中时可缓慢回复生命。"));

        changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
        changes.hardlight(CharSprite.WARNING);
        changeInfos.add(changes);

        changes.addButton( new ChangeButton(new RedDragonSprite(), ("红龙任务"),
                ("红龙任务进行了一些优化，饼正式加入0.6.6.0的游戏中。")));

        changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LANTERNB), ("DLC模式返修"),
                ("BossRush等DLC模式返修中，敬请期待后续版本。")));

        Image i = new YogSprite();
        i.scale.set(0.8f);
        changes.addButton(new ChangeButton(i, ("YogDzewa"),
                ("对梦魇领袖进行了一些优化")));

        Image s = new DM720Sprite();
        s.scale.set(0.8f);
        changes.addButton(new ChangeButton(s, ("DM720"),
                ("现在如果在DM720中使用十字架重生不会roll到DM300战斗楼层，DM300也同理")));

        changes.addButton(new ChangeButton(new MolotovHuntsmanSprite(), ("血月赏金猎人长老"),
                ("DM720与长老贴图优化，并修复了一些bug")));

        changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
                "修复了以下Bug:\n\n" +
                        "特别感谢首席测试官_bzmdr_的大力支持\n\n" +
                        "Demo1(内部测试):\n\n" +
                        "_-_ 1.修复了版本迁移后25层的闪退问题\n" +
                        "_-_ 2.修复了护甲贴图，数值错乱\n" +
                        "_-_ 3.修复了排行榜界面必定崩溃的问题\n" +
                        "_-_ 4.修复了战士初始武器攻击距离异常的问题\n" +
                        "_-_ 5.修复了部分极端情况下Buff显示字段缺失\n" +
                        "_-_ 6.修复了结束游戏点击排行榜爆炸的问题\n" +
                        "_-_ 7.修复了板甲贴图错位\n" +
                        "_-_ 8.修复了部分素材的位置不符合\n" +
                        "_-_ 9.修复了图鉴闪退的问题\n" +
                        "_-_ 10.修复了部分天赋文本缺失的问题\n" +
                        "_-_ 11.修复了开发者模式怪物生成器的一些问题",

                "Demo2(内部测试):\n\n" +
                        "_-_ 1.修复了王冠转移能给鱼甲的问题，并且补充缺失文本\n" +
                        "_-_ 2.修复了部分英雄贴图定位问题\n" +
                        "_-_ 3.修复了基因突变，支离破碎，药水癔症在迁移后不生效的问题\n" +
                        "_-_ 4.修复了迁移后矮人将军不能正常出现的问题\n" +
                        "_-_ 5.修复了霜焰审判卷轴使用不扣减数量的问题\n" +
                        "_-_ 6.修复了toSting错误回环逻辑导致的文本显示异常\n" +
                        "_-_ 7.修复了幻影食人鱼的文本缺失和鱼肉贴图问题\n" +
                        "_-_ 8.修复了武力之戒的文本缺失问题\n" +
                        "_-_ 9.修复了文本气泡的问题\n" +
                        "_-_ 10.修复了炫目诅咒文本缺失问题",

                "Demo3(内部测试):\n\n" +
                        "_-_ 1.修复了使用卷轴额外多扣一个使用数量的问题\n" +
                        "_-_ 2.修复了艾诺琳娜的技能文本缺失问题\n" +
                        "_-_ 3.修复了部分徽章贴图错乱和文本异常问题\n" +
                        "_-_ 4.修复了部分Buff图标错位的问题",

                "Demo4(内部测试):\n\n" +
                        "1:元素怪物攻击造成栈溢出崩溃-结果判定：Mob迁移后未优化，导致爆栈\n" +
                        "2:决斗一层天赋文本 \n-结果判定：一般问题--文本缺失\n" +
                        "3:短柄镰在武器生成器的贴图和位置\n" +
                        "4:新版无诅咒的诅咒附魔武器文本-结果判定：一般问题--文本缺失\n" +
                        "5:水晶尖塔可以被十字镐以外的武器伤害-结果判定：一般问题--逻辑缺陷\n" +
                        "6.开发者模式升降器探索物品功能缺失-结果判定：一般问题--逻辑缺陷\n" +
                        "7.书籍一本时无法阅读-结果判定：一般问题--逻辑缺陷\n" +
                        "8.嬗变泉房间扔东西无法转换-结果判定：一般问题--功能缺陷\n" +
                        "9.DM275攻击策略优化-结果判定：一般问题--优化体验\n" +
                        "10.优化那些回忆，奈亚子的对话框架（现在的比较卡顿）\n" +
                        "结果判定：一般问题--优化体验\n" +
                        "11.需要修复部分界面的严重贴图错乱-结果判定：一般问题--优化体验\n" +
                        "12.需要修复一个4阶武器贴图缺失的问题-结果判定：一般问题--优化体验\n" +
                        "13.需要修复咒缚灵生成失效的问题\n\n" +
                        "以上问题均已修复",

                "Demo5(大群首测):\n\n"+
                "1.修复了草鞋灌注闪退的问题\n" +
                        "2.修复了天狗闪退的问题\n" +
                        "3.修复了新版对话框的异常问题\n" +
                        "4.修复了幻影食人鱼鱼肉贴图和文本缺失的问题\n" +
                        "5.修复了天赋文本缺失的问题" +
                        "6.修复了来自FireBase报告的诸多错误",


                "Demo6-7:\n\n" +
                        "1.修复了幻影食人鱼文本贴图缺失的问题\n" +
                        "2.修复了英雄精英buff尚未生效的问题\n" +
                        "3.同步了蓄血圣杯为原版1.2.3\n" +
                        "4.修复了BR的冲突问题\n" +
                        "5.修复了决斗家的10层闪退bug\n" +
                        "6.修复了子层下楼的错误问题\n" +
                        "7.其他来自FireBase后台报告的Bug集中修复",
                "Demo8:\n\n" +
                        "1.修复了Dm275和矮人将军地图的相关问题，新存档开始生效\n" +
                        "2.修复了错误生成尚未整改的丛林毒刺问题\n" +
                        "3.部分素材贴图迭代优化\n" +
                        "4.其他来自FireBase后台报告的Bug集中修复",
                "RC:\n\n" +
                        "1.修复了返程相关问题\n" +
                        "2.修复了变幻莫测的一些问题\n" +
                        "3.部分素材贴图迭代优化\n" +
                        "4.其他来自FireBase后台报告的Bug集中修复"));




    }

}
