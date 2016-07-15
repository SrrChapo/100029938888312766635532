package pro.srchapo.core.sounds;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;

import org.bukkit.Material;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class sounds
  extends JavaPlugin
  implements Listener
{
  public List<String> Snow;
  public List<String> fire;
  public List<String> Cloud;
  public List<String> Love;
  public List<String> Spark;
  public List<String> Lava;
  public List<String> Ender;
  public List<String> Enchant;
  public List<String> Smook;
  public List<String> INSTANT_SPELL;
  
  public sounds()
  {
    this.Snow = new ArrayList<String>();
    this.fire = new ArrayList<String>();
    this.Cloud = new ArrayList<String>();
    this.Love = new ArrayList<String>();
    this.Spark = new ArrayList<String>();
    this.Lava = new ArrayList<String>();
    this.Ender = new ArrayList<String>();
    this.Enchant = new ArrayList<String>();
    this.Smook = new ArrayList<String>();
    this.INSTANT_SPELL = new ArrayList<String>();
  }
  
  public void reg(PluginManager pm)
  {
    pm.registerEvents(this, this);
  }
  
  public void con(ConsoleCommandSender co)
  {
    co.sendMessage("§e=================================================================");
    co.sendMessage("§9                           CoreServ©");
    co.sendMessage("§6                          VERSION 1.9");
    co.sendMessage("§6                          By Sr_Chapo");
    co.sendMessage("§6                        0--------------0");
    co.sendMessage("§6                          Dependencia");
    co.sendMessage("§4                             Vault");
    co.sendMessage("§e=================================================================");
  }
  
  public void onEnable()
  {
    reg(Bukkit.getPluginManager());
    con(Bukkit.getConsoleSender());
    
    super.onEnable();
  }
  
  public ItemStack Cat()
  {
    ItemStack spawner = new ItemStack(Material.EYE_OF_ENDER);
    ItemMeta sp = spawner.getItemMeta();
    sp.setDisplayName("§6§lCat");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    sp.setLore(lore);
    spawner.setItemMeta(sp);
    return spawner;
  }
  
  public ItemStack Wither()
  {
    ItemStack Snow = new ItemStack(Material.SKULL_ITEM, 1, (short)1);
    ItemMeta SN = Snow.getItemMeta();
    SN.setDisplayName("§7§lWither");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    SN.setLore(lore);
    Snow.setItemMeta(SN);
    return Snow;
  }
  
  public ItemStack Lobo()
  {
    ItemStack C = new ItemStack(Material.BONE);
    ItemMeta CL = C.getItemMeta();
    CL.setDisplayName("§7§lWolf");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    CL.setLore(lore);
    C.setItemMeta(CL);
    return C;
  }
  
  public ItemStack Nothing()
  {
    ItemStack No = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)9);
    ItemMeta N = No.getItemMeta();
    N.setDisplayName("§7[§bSoundKill§7]");
    List<String> lore = new ArrayList<String>();
    N.setLore(lore);
    No.setItemMeta(N);
    return No;
  }
  
  public ItemStack Nothing2()
  {
    ItemStack No = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
    ItemMeta N = No.getItemMeta();
    N.setDisplayName("§7[§bSoundKill§7]");
    List<String> lore = new ArrayList<String>();
    N.setLore(lore);
    No.setItemMeta(N);
    return No;
  }
  
  public ItemStack remove()
  {
    ItemStack remove = new ItemStack(Material.WOOL, 1, (short)14);
    ItemMeta Re = remove.getItemMeta();
    Re.setDisplayName("§4Remove sound");
    List<String> lore = new ArrayList<String>();
    lore.add("§cClick to remove sound.");
    Re.setLore(lore);
    remove.setItemMeta(Re);
    return remove;
  }
  
  public ItemStack onJoin()
  {
    ItemStack on = new ItemStack(Material.NETHER_STAR);
    ItemMeta o = on.getItemMeta();
    o.setDisplayName("§9Trails menu");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    o.setLore(lore);
    on.setItemMeta(o);
    return on;
  }
  
  public ItemStack Villager()
  {
    ItemStack love = new ItemStack(Material.EMERALD);
    ItemMeta lo = love.getItemMeta();
    lo.setDisplayName("§2§lVillager");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    lo.setLore(lore);
    love.setItemMeta(lo);
    return love;
  }
  
  public ItemStack Creeper()
  {
    ItemStack Spa = new ItemStack(Material.GHAST_TEAR);
    ItemMeta sp = Spa.getItemMeta();
    sp.setDisplayName("§2§lGhast");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    sp.setLore(lore);
    Spa.setItemMeta(sp);
    return Spa;
  }
  
  public ItemStack Ender()
  {
    ItemStack Ender = new ItemStack(Material.ENDER_PEARL);
    ItemMeta En = Ender.getItemMeta();
    En.setDisplayName("§5§lEnderman");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    En.setLore(lore);
    Ender.setItemMeta(En);
    return Ender;
  }
  
  public ItemStack Teleport()
  {
    ItemStack Enc = new ItemStack(Material.ENDER_PORTAL_FRAME);
    ItemMeta Ec = Enc.getItemMeta();
    Ec.setDisplayName("§d§lTeleport");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    Ec.setLore(lore);
    Enc.setItemMeta(Ec);
    return Enc;
  }
  
  public ItemStack Lava_Spark()
  {
    ItemStack Lava = new ItemStack(Material.STATIONARY_LAVA);
    ItemMeta La = Lava.getItemMeta();
    La.setDisplayName("§cLava");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    La.setLore(lore);
    Lava.setItemMeta(La);
    return Lava;
  }
  
  public ItemStack Smook()
  {
    ItemStack Smook = new ItemStack(Material.SMOOTH_STAIRS);
    ItemMeta Sm = Smook.getItemMeta();
    Sm.setDisplayName("§eSmoke");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    Sm.setLore(lore);
    Smook.setItemMeta(Sm);
    return Smook;
  }
  
  public ItemStack INSTAN()
  {
    ItemStack IN = new ItemStack(Material.BREWING_STAND_ITEM);
    ItemMeta I = IN.getItemMeta();
    I.setDisplayName("§eInstant Spell");
    List<String> lore = new ArrayList<String>();
    lore.add("§aClick to activate sound.");
    I.setLore(lore);
    IN.setItemMeta(I);
    return IN;
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Ender.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.ENDERMAN_DEATH, 1.0F, 2.0F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener2(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Enchant.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 2.0F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener3(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.fire.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.CAT_MEOW, 1.0F, 2.0F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener7(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Snow.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.WITHER_SPAWN, 1.0F, 2.0F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener6(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Cloud.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.WOLF_DEATH, 1.0F, 2.0F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener5(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Love.contains(killer.getName()))) {
      killer.getWorld().playSound(killer.getLocation(), Sound.VILLAGER_DEATH, 1F, .8F);
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void damageListener4(PlayerDeathEvent event)
  {
    Player killer = event.getEntity().getKiller();
    if ((killer != null) && (this.Spark.contains(killer.getName()))) {
      killer.playSound(killer.getLocation(), Sound.GHAST_SCREAM, 1.0F, 2.0F);
    }
  }
  
  @EventHandler
  public void onClickGui(InventoryClickEvent e)
  {
    Player player = (Player)e.getWhoClicked();
    ItemStack item = e.getCurrentItem();
    String invName = e.getInventory().getName();
    if (invName.equals("§9Sound Kill"))
    {
      e.setCancelled(true);
      if (e.getCurrentItem() == null) {
        return;
      }
      if (!e.getCurrentItem().hasItemMeta()) {
        return;
      }
      if (item.getType() == Material.EYE_OF_ENDER)
      {
        if (!player.hasPermission("core.sound.cat"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §6§lCat");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Cat");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.fire.add(player.getName());
          this.Snow.remove(player.getName());
          this.Cloud.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Love.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.EMERALD)
      {
        if (!player.hasPermission("core.sound.villager"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §2§lVillager");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Villager");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Love.add(player.getName());
          this.Snow.remove(player.getName());
          this.Cloud.remove(player.getName());
          this.fire.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.SKULL_ITEM)
      {
        if (!player.hasPermission("core.sound.wither"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §7§lWither");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Wither");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Snow.add(player.getName());
          this.Cloud.remove(player.getName());
          this.fire.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Love.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.BONE)
      {
        if (!player.hasPermission("core.sound.wolf"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §7§lWolf");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Wolf");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Cloud.add(player.getName());
          this.Snow.remove(player.getName());
          this.fire.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Love.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.GHAST_TEAR)
      {
        if (!player.hasPermission("core.sound.ghast"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §2§lGhast");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Ghast");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Spark.add(player.getName());
          this.Snow.remove(player.getName());
          this.Cloud.remove(player.getName());
          this.fire.remove(player.getName());
          this.Love.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.ENDER_PEARL)
      {
        if (!player.hasPermission("core.sound.enderman"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §5§lEnderman");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Enderman");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Ender.add(player.getName());
          this.Snow.remove(player.getName());
          this.Cloud.remove(player.getName());
          this.fire.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Love.remove(player.getName());
          this.Enchant.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.ENDER_PORTAL_FRAME)
      {
        if (!player.hasPermission("core.sound.teleport"))
        {
          player.sendMessage("§7[§bSoundKill§7] §cYou are not allowed to §d§lTeleport");
          player.closeInventory();
          player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
        }
        else
        {
          player.closeInventory();
          player.sendMessage("§7[§bSoundKill§7] §eYou have activated Sound Teleport");
          player.playSound(player.getLocation(), Sound.SUCCESSFUL_HIT, 1.0F, 1.0F);
          this.Enchant.add(player.getName());
          this.Snow.remove(player.getName());
          this.Cloud.remove(player.getName());
          this.fire.remove(player.getName());
          this.Spark.remove(player.getName());
          this.Love.remove(player.getName());
          this.Ender.remove(player.getName());
          this.Lava.remove(player.getName());
          this.INSTANT_SPELL.remove(player.getName());
          this.Smook.remove(player.getName());
        }
      }
      else if (item.getType() == Material.WOOL)
      {
        player.closeInventory();
        player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
        player.sendMessage("§7[§bSoundKill§7] §cSound removed.");
        this.Snow.remove(player.getName());
        this.Cloud.remove(player.getName());
        this.fire.remove(player.getName());
        this.Spark.remove(player.getName());
        this.Love.remove(player.getName());
        this.Enchant.remove(player.getName());
        this.Ender.remove(player.getName());
        this.Lava.remove(player.getName());
        this.INSTANT_SPELL.remove(player.getName());
        this.Smook.remove(player.getName());
      }
    }
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player P = (Player)sender;
    if (((command.getName().equalsIgnoreCase("sound")) && ((sender instanceof Player))) || (sender.hasPermission("core.sound")))
    {
      Inventory Effect = Bukkit.getServer().createInventory(P, 36, "§9Sound Kill");
      P.openInventory(Effect);
      Effect.setItem(0, remove());
      Effect.setItem(1, Cat());
      Effect.setItem(2, Villager());
      Effect.setItem(3, Wither());
      Effect.setItem(4, Lobo());
      Effect.setItem(5, Creeper());
      Effect.setItem(6, Ender());
      Effect.setItem(7, Teleport());
      P.updateInventory();
    }
    return super.onCommand(sender, command, label, args);
  }
}