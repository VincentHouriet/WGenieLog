
package Exo_git;

import java.util.Stack;

public class SuperPile extends Stack<Integer>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	private SuperPile()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/
	public synchronized static SuperPile getInstance()
		{
		if (instance == null)
			{
			instance = new SuperPile();
			System.out.println("Nouvelle pile créée");
			}
		return instance;
		}

	public void empiler(int x)
		{
		super.push(x);
		System.out.println("Elément empilé: " + x);
		}

	public void depiler()
		{
		if (super.isEmpty())
			{
			msgVide();
			}
		else
			{
			int element = super.pop();
			System.out.println("Elément depilé: " + element);
			}
		}

	public void sommet()
		{
		int premier = super.pop();
		super.push(premier);
		System.out.println("1er élément dans la pile (tout en haut): " + premier);
		}

	public void sousSommet()
		{
		int premier = super.pop();
		int deuxieme = super.pop();
		super.push(deuxieme);
		super.push(premier);
		System.out.println("2e élément dans la pile (depuis le haut): " + deuxieme);
		}

	public void taille()
		{
		System.out.println("Taille: " + super.size());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	private void msgVide()
		{
		System.out.println("Pile vide");
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	//Tools
	private static SuperPile instance;

	}
