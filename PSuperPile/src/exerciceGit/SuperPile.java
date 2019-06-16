
package exerciceGit;

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
			System.out.println("Nouvelle pile cr��e");
			}
		return instance;
		}

	public void empiler(int x)
		{
		super.push(x);
		System.out.println("El�ment empil�: " + x);
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
			System.out.println("El�ment depil�: " + element);
			}
		}

	public void sommet()
		{
		int premier = super.pop();
		super.push(premier);
		System.out.println("1er �l�ment dans la pile (tout en haut): " + premier);
		}

	public void sousSommet()
		{
		int premier = super.pop();
		int deuxieme = super.pop();
		super.push(deuxieme);
		super.push(premier);
		System.out.println("2e �l�ment dans la pile (depuis le haut): " + deuxieme);
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
